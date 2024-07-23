package observer;

public class Main {
    public static void main(String[] args) {
        IObservable observable = new ConcretObsevable();

        IObserver observer1 = new ConcreteObserver("Misha");
        IObserver observer2 = new ConcreteObserver("Petr");
        IObserver observer3 = new ConcreteObserver("Masha");

        observable.addObserver(observer1);
        observable.addObserver(observer2);
        observable.addObserver(observer3);

        pause();

        observable.notifyObservers();
    }

    private static void pause() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
