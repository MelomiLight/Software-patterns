public class SecondConorMcGregorStrategy {

    public static void main(String[] args) {
        System.out.println("Fight against Conor starting...");
        var Exam = new FightAgainstMcgregor(new KickBoxStrategy());
        Exam.goToFight();
        System.out.println("Fight against Conor starting...");
        Exam.changeStrategy(new jiuJitsuStrategy());
        Exam.goToFight();
        System.out.println("Fight against Conor starting...");
        Exam.changeStrategy(new wrestlingStrategy());
        Exam.goToFight();

    }
}
