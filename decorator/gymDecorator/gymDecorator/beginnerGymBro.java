package gymDecorator;
public class beginnerGymBro implements gymBro {
    @Override
    public void liftWeight() {
        System.out.println("Lifting small weights...");
    }

    @Override
    public String goThroughTheDoor() {
        return "CAN";
    }
}
