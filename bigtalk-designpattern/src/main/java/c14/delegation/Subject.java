package c14.delegation;

public interface Subject {

    void notifyObservers();

    String getSubjectState();

    String setSubjectState(String state);

}