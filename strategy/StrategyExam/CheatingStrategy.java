public class CheatingStrategy implements ExamPassingStrategy {
    @Override
    public void execute() {
        System.out.println("You have prepared cheat sheets for the exam, your cheat sheets have been noticed,FAIL");
    }
}
