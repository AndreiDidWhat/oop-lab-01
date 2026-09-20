import strategies.*;
import java.util.Scanner;

public class StrategyPattern {
    public static void main() {
        Hero hero = new Hero(new WalkingStrategy());

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            printMenu();
            System.out.print("Ваш выбор: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    hero.setMovementStrategy(new WalkingStrategy());
                    break;
                case "2":
                    hero.setMovementStrategy(new HorseRidingStrategy());
                    break;
                case "3":
                    hero.setMovementStrategy(new FlyingStrategy());
                    break;
                case "4":
                    hero.setMovementStrategy(new SwimmingStrategy());
                    break;
                case "5":
                    exit = true;
                    System.out.println("Выход из программы...");
                    continue;
                default:
                    System.out.println("Ошибка ввода");
                    continue;
            }
            hero.move();
        }
        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\nСпособ перемещения героя:");
        System.out.println("1. Пешком");
        System.out.println("2. На лошади");
        System.out.println("3. Лететь");
        System.out.println("4. Плыть");
        System.out.println("5. Выход");
    }
}