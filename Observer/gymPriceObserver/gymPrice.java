
import java.util.ArrayList;


public class gymPrice implements gymPriceObserved {
    private String price;
    private String description;
    private final ArrayList<Observer> observers=new ArrayList<>();
    public gymPrice(String price, String description){
        this.price=price;
        this.description=description;
    }
    public void SetPrice(String price){
        this.price=price;
        notifyObservers();
    }
    public void setDescription(String description){
        this.description=description;
        notifyObservers();
    }
    public String getPrice(){
        return price;
    }
    public String getDescription(){
        return description;
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
    observers.forEach(observer -> observer.update(price,description));
        }
    }
