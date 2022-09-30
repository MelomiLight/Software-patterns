package gymDecorator;
public class UltraGymBro implements gymBro {
    private final gymBro decorated;
    public UltraGymBro(gymBro decorated){
        this.decorated=decorated;
    }

    @Override
    public void liftWeight() {
        System.out.println("Lifting +100kg weights everywhere...");
    }

    @Override
    public String goThroughTheDoor() {
        return decorated.goThroughTheDoor()+"NOT";
    }
}
