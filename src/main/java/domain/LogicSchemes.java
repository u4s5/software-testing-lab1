package domain;

public class LogicSchemes {

    Idea ideaToManipulate = new ApplyingPhysicalViolenceToDoorIdea();

    boolean chirredInDisgust = false;
    boolean isClicked = false;
    String spokenString = null;
    boolean hadFun = false;
    boolean comparativeAnalysisMade = false;
    boolean levelMeasured = false;
    boolean isOff = false;

    void chirrInDisgust() {
        chirredInDisgust = true;
    }

    void manipulateIdea() {
        ideaToManipulate.setManipulated();
    }

    void click() {
        isClicked = true;
    }

    void say(String stringToSay) {
        spokenString = stringToSay;
    }

    void haveFun() {
        makeComparativeAnalysisOfMolecularComponentsOfDoorAndHumanBrainCells();
        hadFun = true;
    }

    void makeComparativeAnalysisOfMolecularComponentsOfDoorAndHumanBrainCells() {
        comparativeAnalysisMade = true;
    }

    void measureLevelOfHydrogenInNearbyCubicParsecSpace() {
        levelMeasured = true;
    }

    void off() {
        isOff = true;
    }

}
