package ObserverPattern;

import ObserverPattern.Observable.IphoneObservable;
import ObserverPattern.Observable.StocksObservable;
import ObserverPattern.Observer.EmailAlertObserver;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String args[]){
        StocksObservable iphone= new IphoneObservable();

        NotificationAlertObserver obs1= new EmailAlertObserver("abc@gmail.com");
        NotificationAlertObserver obs2= new EmailAlertObserver("xyz@gmail.com");

        iphone.add(obs1);
        iphone.add(obs2);
        iphone.setStocksCount(10);
        System.out.println(iphone.getStocksCount());
    }
}
