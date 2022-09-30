package gymDecorator;

public class app {
    public static void main(String[] args) {
        System.out.println("Beginner gym bro starting his journey to gym world...");
        beginnerGymBro beginnerGymBro =new beginnerGymBro();
        beginnerGymBro.liftWeight();
        System.out.println("Beginner gym bro "+ beginnerGymBro.goThroughTheDoor()+" go through the door:(");

        System.out.println("Ultra gym bro have already conquered his gym.");
        UltraGymBro UltraGymBro =new UltraGymBro(beginnerGymBro);
        UltraGymBro.liftWeight();
        System.out.println("Ultra gym bro "+ UltraGymBro.goThroughTheDoor()+" go through the door:)");
    }
}
