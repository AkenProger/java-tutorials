import models.GameHistory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GameController {
    private final Random random = new Random();
    private final Scanner scanner = new Scanner(System.in);
    private final List<String> userNames = new ArrayList<>(
            List.of("vica", "mara", "jaka")
    );
    private int COUNT_OF_QUESTION = 5;
    private String userSessionName = "";
    private String gameLeveSession = "";
    private final List<GameHistory> gameHistories = new ArrayList<>();

    public void openGame() {
        System.out.println("Welcome to MATH GAME! \n Sign in please:");
        System.out.println("your code:");
        String userCode = scanner.nextLine();
        boolean isAuthSuccess = auth(userCode);
        if (isAuthSuccess) {
            userSessionName = userCode;
            System.out.println("Game menu: [1] My game history: [2] Start game: [3]Game settings:");
            int select = scanner.nextInt();
            if (select == 1) {
                showUserHistoryByName(userCode);
            } else if (select == 2) {
                scanner.nextLine();
                System.out.println("Select operation symbol in [/, *, -, +, power]");
                String operationSymbol = scanner.nextLine();
                System.out.println("Select your level in ['easy', 'medium', 'hard']");
                String level = scanner.nextLine();
                gameLeveSession = level;
                startGame(operationSymbol, level);
            } else if (select == 3) {
                settings();
            } else {
                System.out.println("select error!");
            }
        } else {
            System.out.println("Auth error!");
        }
    }


    public boolean auth(String codeName) {
        return userNames.stream()
                .anyMatch(s -> s.equals(codeName));
    }

    public void startGame(String operationSymbol, String level) {
        int countOfRight = 0;
        int countOfLeft = 0;
        int questionCounter = 0;
        int a = 0, b = 0, result = 0;
        for (int i = 0; i < COUNT_OF_QUESTION; i++) {
            questionCounter++;
            switch (level) {
                case "easy":
                    a = 1 + (int) (Math.random() * 10);
                    b = 1 + (int) (Math.random() * 10);

                    break;
                case "medium":
                    a = 50 + (int) (Math.random() * 100);
                    b = 50 + (int) (Math.random() * 100);
                    break;
                case "hard":
                    a = 100 + (int) (Math.random() * 1000);
                    b = 100 + (int) (Math.random() * 1000);
                    break;
                default:
                    System.out.println("Level error!");
            }
            switch (operationSymbol) {
                case "-":
                    result = a - b;
                    break;
                case "+":
                    result = a + b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    result = a / b;
                    break;
                default:
                    System.out.println("Operation symbol error!");
            }
            System.out.println("Question №-" + questionCounter + " | " + a + " " + operationSymbol + " " + b + " = ?");
            int answer = scanner.nextInt();
            if (answer == result) {
                System.out.println("Right!");
                countOfRight++;
            } else {
                System.out.println("Left!");
                countOfLeft++;
            }
        }
        gameHistories.add(new GameHistory(random.nextInt(), userSessionName, countOfRight, countOfLeft, COUNT_OF_QUESTION, gameLeveSession));
        System.out.println("left = " + countOfLeft);
        System.out.println("right = " + countOfRight);
    }

    public void showUserHistoryByName(String userCode) {
        System.out.println("Game history:" + " USER:" + userSessionName);
        gameHistories.stream()
                .filter(s -> s.getUserName().equals(userCode))
                .forEach(System.out::println);
    }

    public void settings() {
        scanner.nextLine();
        System.out.println("GAME SETTINGS");
        System.out.println("1:Count of questions:" + COUNT_OF_QUESTION);
        System.out.println("Do you want change questions count ? Yes or No:");
        String select = scanner.nextLine();
        if (select.equals("Yes")) {
            System.out.println("Set count of questions please?");
            COUNT_OF_QUESTION = scanner.nextInt();
            System.out.println("Setting changed success!");
        }
    }

}
