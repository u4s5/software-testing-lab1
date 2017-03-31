package domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DomainInteractionTest {

    private Marvin marvin;

    @Before
    public void initialize() {
        marvin = new Marvin();
    }

    @Test
    public void testWatchingTheDoor() {
        marvin.watchTheDoorWithColdContempt();
        assertTrue("Testing watchTheDoorWithColdContempt", marvin.lookedAtDoorWithColdContempt);
    }

    @Test
    public void testChirringInDisgust() {
        marvin.logicSchemes.chirrInDisgust();
        assertTrue("Testing chirrInDisgust", marvin.logicSchemes.chirredInDisgust);
    }

    @Test
    public void testManipulatingIdea() {
        marvin.logicSchemes.manipulateIdea();
        assertTrue("Testing manipulateIdea", marvin.logicSchemes.ideaToManipulate.isManipulated());
    }

    @Test
    public void testIdea() {
        assertEquals("Testing manipulating idea", marvin.logicSchemes.ideaToManipulate.getIdea(), "Idea of applying physical violence to the door");
    }

    @Test
    public void testClick() {
        marvin.logicSchemes.click();
        assertTrue("Testing click", marvin.logicSchemes.isClicked);
    }

    @Test
    public void testSaying() {
        marvin.logicSchemes.say("А стоит ли обращать внимание? Ради чего?");
        assertEquals("Testing say", marvin.logicSchemes.spokenString, "А стоит ли обращать внимание? Ради чего?");
    }

    @Test
    public void testHavingFun() {
        marvin.logicSchemes.haveFun();
        assertTrue("Testing haveFun", marvin.logicSchemes.hadFun);
    }

    @Test
    public void testMakingComparativeAnalysis() {
        marvin.logicSchemes.haveFun();
        assertTrue("Testing comparative analysis", marvin.logicSchemes.comparativeAnalysisMade);
    }

    @Test
    public void testMeasuringLevel() {
        marvin.logicSchemes.measureLevelOfHydrogenInNearbyCubicParsecSpace();
        assertTrue("Testing measureLevelOfHydrogenInNearbyCubicParsecSpace", marvin.logicSchemes.levelMeasured);
    }

    @Test
    public void testTurningLogicSchemesOff() {
        marvin.logicSchemes.off();
        assertTrue("Testing logicSchemes.off", marvin.logicSchemes.isOff);
    }

    @Test
    public void testTurningWithSpasmOfDespair() {
        marvin.turnWithSpasmOfDespair();
        assertTrue("Testing turnWithSpasmOfDespair", marvin.turnedWithSpasmOfDespair);
    }

}
