package Model;

import Observer.Observer;
import Observer.Subject;
import java.util.ArrayList;
import java.util.List;

public class Applicant implements Subject {
    private final String name;
    private final int age;
    private final int previousMarks;
    private final int testScore;
    private final int interviewScore;
    private final List<Observer> observers = new ArrayList<>();
    private final List<String> status = new ArrayList<>();

    public Applicant(String name, int age, int previousMarks, int testScore, int interviewScore) {
        this.name = name;
        this.age = age;
        this.previousMarks = previousMarks;
        this.testScore = testScore;
        this.interviewScore = interviewScore;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPreviousMarks() {
        return previousMarks;
    }

    public int getTestScore() {
        return testScore;
    }

    public int getInterviewScore() {
        return interviewScore;
    }

    public boolean isEligible() {
        return status.contains("Eligible");
    }

    public boolean isTestPassed() {
        return status.contains("Passed Test");
    }

    public boolean isInterviewCleared() {
        return status.contains("Cleared Interview");
    }

    public void addStatus(String newStatus) {
        status.add(newStatus);
        notifyObservers("Status Updated: " + newStatus);
    }

    public String getStatus() {
        return String.join(", ", status);
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
