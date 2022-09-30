package programmerDecorator;

public class mainn {
    public static void main(String[] args) {
        System.out.println("Weak Junior getting a job.");
        weakJunior weakJunior=new weakJunior();
        weakJunior.writeCode();
        System.out.println("Weak Junior has "+weakJunior.getSalary()+"$ salary");

        System.out.println("Experienced strong Junior getting a job.");
        experiencedJunior experiencedJunior=new experiencedJunior(weakJunior);
        experiencedJunior.writeCode();
        System.out.println("Experienced strong Junior has "+experiencedJunior.getSalary()+"$ salary");
    }
}
