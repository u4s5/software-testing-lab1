package domain;

public class ApplyingPhysicalViolenceToDoorIdea implements Idea {

    private boolean isManipulated = false;

    public String getIdea() {
        return "Idea of applying physical violence to the door";
    }

    public boolean isManipulated() {
        return isManipulated;
    }

    public void setManipulated() {
        isManipulated = true;
    }

}
