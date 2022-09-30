public interface ticketDestinationObserved {
   void addObserver(Observer observer);
   void removeObserver(Observer observer);
   void notifyObservers();
}

