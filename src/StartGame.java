import java.io.Console;
import java.util.Scanner;

public class StartGame {

    static Scanner scanner = new Scanner(System.in);


    //The method that will call the entire game
    public static void LetTheGameBegin() {
        //Call the method to display nice terminal
        ConsoleOperators.DisplayInfo("Let the game begin");

        //Calls the method that gives the user the ability to continue, when he is ready.
        ConsoleOperators.PressAnythingToContinue();

        //Calls the method that gives the user the ecision to start
        UserChoice.UserChoices();

        //Calls the method where the game logic is
        GameInput();
    }

    //The method will take the user input and give the opportunity to get more dices
    public static void GameInput() {
        int usersFirstHand = ThrowDice.DiceValueMultipleTwo();
        String userChoice;

        System.out.println("Your first throw: " + usersFirstHand);


            do {
                System.out.println("Would you like to add a dice to your current sum? \nPress Y/N");
                userChoice = scanner.nextLine();

                if(userChoice.equalsIgnoreCase("Y")) {
                    int sum = ThrowDice.DiceValue() + usersFirstHand;
                    System.out.println("Current dice value: " + sum);
                    usersFirstHand = sum;

                    //If sum == 21 you hit blackjack
                    if (sum == 21) {
                        System.out.println("!!!!You hit blackjack!!!! You WON!!!");
                        System.exit(0);
                    }

                    //if sum > 21 system will win
                    if(sum > 21) {
                        System.out.println("You done");
                        userChoice = "N";
                        System.out.println("System won, you lost your money. Game will end.");
                        System.exit(0);

                    }
                }

            } while (!userChoice.equalsIgnoreCase("N"));

            System.out.println("You choose to hold \nNow it is the machines turn");
            MachineDice.MachinesTurn();


        }
    }


