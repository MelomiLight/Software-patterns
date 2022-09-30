
import java.util.ArrayList;
public class ticketDestination implements ticketDestinationObserved {
    private String ticket;
    private String status;
    private final ArrayList<Observer> observers=new ArrayList<>();
    public ticketDestination(String ticket, String status){
        this.ticket=ticket;
        this.status=status;
    }
    public void SetTicket(String ticket){
        this.ticket=ticket;
        notifyObservers();
    }
    public void setStatus(String status){
        this.status=status;
        notifyObservers();
    }
    public String getTicket(){
        return ticket;
    }
    public String getStatus(){
        return status;
    }
    public ArrayList<Observer> getObservers(){
        return observers;
    }
    @Override
    public void addObserver(Observer observer) {
    observers.add((observer));
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove((observer));
    }

    @Override
    public void notifyObservers() {
    observers.forEach(observer -> observer.update(ticket,status));
        }
    }
