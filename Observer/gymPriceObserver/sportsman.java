public class sportsman implements Observer {
    private final String firstName;
    public sportsman(String firstName){
        this.firstName=firstName;
    }
    @Override
    public void update(String price, String description) {
        System.out.println(firstName+" "+price+" amount changed");
    }
}
