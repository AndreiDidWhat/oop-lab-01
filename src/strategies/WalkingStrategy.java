package strategies;

public class WalkingStrategy  implements MovementStrategy {
    @Override
    public void move() {
        System.out.println("Герой идёт пешком");
    }
}
