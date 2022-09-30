package programmerDecorator;

public class experiencedJunior implements programmer{
    private final programmer decorated;
    public experiencedJunior(programmer decorated){
        this.decorated=decorated;
    }

    @Override
    public void writeCode() {
        System.out.println("Almost no shit code...");
    }

    @Override
    public int getSalary() {
        return decorated.getSalary()+5000;
    }
}
