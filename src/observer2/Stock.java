package observer2;

import java.util.ArrayList;
import java.util.List;

public class Stock implements IObservable {
    private StockInfo stockInfo;
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
            observer.update(stockInfo);
        }
    }

    static class StockInfo {
        public int usd;
        public int eur;
    }

    public Stock() {
        stockInfo = new StockInfo();
    }

    public void setRate() {
        stockInfo.eur = (int) (Math.random() * 100);
        stockInfo.usd = (int) (Math.random() * 100);
        notifyObservers();
    }
}
