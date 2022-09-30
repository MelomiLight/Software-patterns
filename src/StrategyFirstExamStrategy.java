public class StrategyFirstExamStrategy {

    public static void main(String[] args) {
        System.out.println("Math Exam starting...");
        var Exam = new Exam(new FullPreparationStrategy());
        Exam.goToExam();
        System.out.println("C++ Exam starting...");
        Exam.changeStrategy(new CheatingStrategy());
        Exam.goToExam();
        System.out.println("Geography Exam starting...");
        Exam.changeStrategy(new NoPreparationStrategy());
        Exam.goToExam();

    }
}
