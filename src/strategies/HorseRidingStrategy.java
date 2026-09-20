package strategies;

public class HorseRidingStrategy implements MovementStrategy {
    @Override
    public void move() {
        System.out.println("Герой скачет на лошади");
    }
}