package domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DomainTest {

    Marvin marvin;

    @Before
    public void initialize() {
        marvin = new Marvin();
    }

    @Test
    public void testInitialState() {
        assertNotNull("Testing marvin.logicSchemes != null", marvin.logicSchemes);
        assertNotNull("Testing marvin.logicSchemes.ideaToManipulate != null", marvin.logicSchemes.ideaToManipulate);

        assertFalse("Testing marvin.lookedAtDoorWithColdContempt", marvin.lookedAtDoorWithColdContempt);
        assertFalse("Testing marvin.turnedWithSpasmOfDespair", marvin.turnedWithSpasmOfDespair);
        assertFalse("Testing marvin.logicSchemes.isOff", marvin.logicSchemes.isOff);
        assertFalse("Testing marvin.logicSchemes.levelMeasured", marvin.logicSchemes.levelMeasured);
        assertFalse("Testing marvin.logicSchemes.comparativeAnalysisMade", marvin.logicSchemes.comparativeAnalysisMade);
        assertFalse("Testing marvin.logicSchemes.hadFun", marvin.logicSchemes.hadFun);
        assertFalse("Testing marvin.logicSchemes.isClicked", marvin.logicSchemes.isClicked);
        assertFalse("Testing marvin.logicSchemes.chirredInDisgust", marvin.logicSchemes.chirredInDisgust);
        assertFalse("Testing marvin.logicSchemes.ideaToManipulate.isManipulated()", marvin.logicSchemes.ideaToManipulate.isManipulated());

        assertNull("Testing marvin.logicSchemes.spokenString == null", marvin.logicSchemes.spokenString);

        assertEquals("Testing marvin.logicSchemes.ideaToManipulate.getIdea()", marvin.logicSchemes.ideaToManipulate.getIdea(), "Idea of applying physical violence to the door");
    }

    @Test
    public void testCase() {
        marvin.watchTheDoorWithColdContempt();
        assertTrue("Testing watchTheDoorWithColdContempt", marvin.lookedAtDoorWithColdContempt);

        marvin.logicSchemes.chirrInDisgust();
        assertTrue("Testing chirrInDisgust", marvin.logicSchemes.chirredInDisgust);

        marvin.logicSchemes.manipulateIdea();
        assertTrue("Testing manipulateIdea", marvin.logicSchemes.ideaToManipulate.isManipulated());
        assertEquals("Testing manipulating idea", marvin.logicSchemes.ideaToManipulate.getIdea(), "Idea of applying physical violence to the door");

        marvin.logicSchemes.click();
        assertTrue("Testing click", marvin.logicSchemes.isClicked);

        marvin.logicSchemes.say("А стоит ли обращать внимание? Ради чего?");
        assertEquals("Testing say", marvin.logicSchemes.spokenString, "А стоит ли обращать внимание? Ради чего?");

        marvin.logicSchemes.haveFun();
        assertTrue("Testing haveFun", marvin.logicSchemes.hadFun);
        assertTrue("Testing comparative analysis", marvin.logicSchemes.comparativeAnalysisMade);

        marvin.logicSchemes.measureLevelOfHydrogenInNearbyCubicParsecSpace();
        assertTrue("Testing measureLevelOfHydrogenInNearbyCubicParsecSpace", marvin.logicSchemes.comparativeAnalysisMade);

        marvin.logicSchemes.off();
        assertTrue("Testing off", marvin.logicSchemes.isOff);

        marvin.turnWithSpasmOfDespair();
        assertTrue("Testing turnWithSpasmOfDespair", marvin.turnedWithSpasmOfDespair);
    }

}
