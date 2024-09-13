import java.util.Scanner;

public class UserChoice {

    static Scanner scanner = new Scanner(System.in);


    //Used to give the user the choice to start. It will loop endlessly until the user choose one
    public static void UserChoices() {
        int userDecision;
        do {
            System.out.println("Press 1 to get two dices");
            try {
                userDecision = Integer.parseInt(scanner.next());
            } catch (Exception e) {
                System.out.println("You have to enter 1 to start");
                userDecision = 0;
            }
        } while (userDecision != 1);
    }

}
