package Behavioral.observer;

public interface Observed {
    public void addObserver(Observer observer);
    public void removeObservers(Observer observer);
    public void notifyObservers();
}
