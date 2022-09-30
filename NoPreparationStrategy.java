public class NoPreparationStrategy implements ExamPassingStrategy{
    @Override
    public void execute() {
        System.out.println("You are not prepared for the exam at all, but fortune is on your side, you took 40 points out of 100");
    }
}
