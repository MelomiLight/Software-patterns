public class traveler implements Observer {
    private final String firstName;
    public traveler(String firstName){
        this.firstName=firstName;
    }
    @Override
    public void update(String ticket, String status) {
        System.out.println(firstName+" "+ticket+" status changed");
    }
}
