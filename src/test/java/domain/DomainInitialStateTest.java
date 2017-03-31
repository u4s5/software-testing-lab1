package domain;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class DomainInitialStateTest {

    private static Marvin marvin = new Marvin();

    @Parameterized.Parameter
    public String msg;
    @Parameterized.Parameter(1)
    public boolean condition;

    @Parameterized.Parameters(name = "{index}) {3}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Testing marvin.logicSchemes != null", marvin.logicSchemes != null},
                {"Testing marvin.logicSchemes.ideaToManipulate != null", marvin.logicSchemes.ideaToManipulate != null},
                {"Testing marvin.lookedAtDoorWithColdContempt", !marvin.lookedAtDoorWithColdContempt},
                {"Testing marvin.turnedWithSpasmOfDespair", !marvin.turnedWithSpasmOfDespair},
                {"Testing marvin.logicSchemes.isOff", !marvin.logicSchemes.isOff},
                {"Testing marvin.logicSchemes.levelMeasured", !marvin.logicSchemes.levelMeasured},
                {"Testing marvin.logicSchemes.comparativeAnalysisMade", !marvin.logicSchemes.comparativeAnalysisMade},
                {"Testing marvin.logicSchemes.hadFun", !marvin.logicSchemes.hadFun},
                {"Testing marvin.logicSchemes.isClicked", !marvin.logicSchemes.isClicked},
                {"Testing marvin.logicSchemes.chirredInDisgust", !marvin.logicSchemes.chirredInDisgust},
                {"Testing marvin.logicSchemes.ideaToManipulate.isManipulated()", !marvin.logicSchemes.ideaToManipulate.isManipulated()},
                {"Testing marvin.logicSchemes.spokenString == null", marvin.logicSchemes.spokenString == null},
                {"Testing marvin.logicSchemes.ideaToManipulate.getIdea()", marvin.logicSchemes.ideaToManipulate.getIdea().equals("Idea of applying physical violence to the door")}
        });
    }

    @Test
    public void testCase() {
        assertTrue(msg, condition);
    }

}
