import java.util.Objects;
import java.util.Scanner;

public class GameStarter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameController gameController = new GameController();
        while (true) {
            gameController.openGame();
            System.out.println("Do you want exit?");
            String answer = scanner.nextLine();
            if (Objects.equals(answer, "yes")) {
                break;
            }
            scanner.nextLine();
        }
    }
}
