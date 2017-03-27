package domain;

public class Marvin {

    LogicSchemes logicSchemes = new LogicSchemes();

    boolean lookedAtDoorWithColdContempt = false;
    boolean turnedWithSpasmOfDespair = false;

    void watchTheDoorWithColdContempt() {
        lookedAtDoorWithColdContempt = true;
    }

    void turnWithSpasmOfDespair() {
        turnedWithSpasmOfDespair = true;
    }

}
