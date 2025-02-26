package ObserverPattern.Observable;
import ObserverPattern.Observer.NotificationAlertObserver;

public interface StocksObservable {
    public void add(NotificationAlertObserver obs);
    public void remove(NotificationAlertObserver obs);
    public void notifySubscribers();
    public void setStocksCount(int s);
    public int getStocksCount();
}
