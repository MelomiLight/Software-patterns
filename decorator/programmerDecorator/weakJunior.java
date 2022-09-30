package programmerDecorator;

public class weakJunior implements programmer{
    @Override
    public void writeCode() {
        System.out.println("Writing shit code...");
    }

    @Override
    public int getSalary() {
        return 1000;
    }
}
