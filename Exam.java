public class Exam {

    private ExamPassingStrategy strategy;

    public Exam(ExamPassingStrategy strategy) {
        this.strategy = strategy;
    }

    public void changeStrategy(ExamPassingStrategy strategy) {
        this.strategy = strategy;
    }

    public void goToExam() {
        strategy.execute();
    }
}
