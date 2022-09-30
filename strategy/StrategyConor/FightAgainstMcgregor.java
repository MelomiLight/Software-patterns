public class FightAgainstMcgregor {

    private McgregorFightStrategy strategy;

    public FightAgainstMcgregor(McgregorFightStrategy strategy) {
        this.strategy = strategy;
    }

    public void changeStrategy(McgregorFightStrategy strategy) {
        this.strategy = strategy;
    }

    public void goToFight() {
        strategy.execute();
    }
}
