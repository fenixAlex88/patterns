package observer2;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();

        IObserver brocker1 = new Broker(stock, "Misha");
        IObserver brocker2 = new Broker(stock, "Petr");
        IObserver brocker3 = new Broker(stock, "Masha");

        pause();
        stock.setRate();

        pause();
        stock.setRate();

        pause();
        stock.setRate();
    }

    private static void pause() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
