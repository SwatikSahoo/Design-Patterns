package ObserverPattern.Observer;

public class EmailAlertObserver implements NotificationAlertObserver{

    String mail;
    public EmailAlertObserver(String mail){
        this.mail=mail;
    }

    @Override
    public void update(){
        System.out.println("Notification Sent to: "+mail);
    }
}
