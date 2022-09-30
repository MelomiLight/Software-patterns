public class mainn {
    public static void main(String[] args) {
    gymPrice gymPrice=new gymPrice("price","15000");
    sportsman Beknur=new sportsman("Beknur");
    sportsman Bahyt=new sportsman("Bahyt");
    sportsman Alisher=new sportsman("Alisher");
        gymPrice.addObserver(Beknur);
        gymPrice.addObserver(Bahyt);
        gymPrice.addObserver(Alisher);
        gymPrice.setDescription("15000");
        System.out.println(gymPrice.getPrice()+" gym cost changed to "+gymPrice.getDescription()+" tenge");
    }
}
