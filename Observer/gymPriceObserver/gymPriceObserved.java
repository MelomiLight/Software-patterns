public interface gymPriceObserved {
   void addObserver(Observer observer);
   void removeObserver(Observer observer);
   void notifyObservers();
}

