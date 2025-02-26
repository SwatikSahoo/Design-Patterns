package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;

import java.util.*;

public class IphoneObservable implements StocksObservable{
    public List<NotificationAlertObserver> observerList= new ArrayList<>();
    public int stocks=0;
    @Override
    public void add(NotificationAlertObserver obs){
        observerList.add(obs);
    }
    @Override
    public void remove(NotificationAlertObserver obs){
        observerList.remove(obs);
    }
    @Override
    public void notifySubscribers(){
        for(NotificationAlertObserver obs:observerList){
            obs.update();
        }
    }
    @Override
    public void setStocksCount(int s){
        if(stocks==0){
            notifySubscribers();
        }
        stocks+=s;

    }
    @Override
    public int getStocksCount(){
        return stocks;
    }
}
