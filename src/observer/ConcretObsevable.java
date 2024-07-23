package observer;

import java.util.ArrayList;
import java.util.List;

public class ConcretObsevable implements IObservable{
    List<IObserver> observers = new ArrayList();

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update();
        }
    }
}
