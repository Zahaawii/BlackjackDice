import java.util.Scanner;

public class ConsoleOperators {

    static Scanner scanner = new Scanner(System.in);


    //Creates a pretty overlay for the termnial
    public static void PrintSeperator(int n) {
        for(int i = 0; i < n; i++)
            System.out.print("-");
        System.out.println();
    }

    //Used to create a displayinfo for the terminal
    public static void DisplayInfo(String prompt) {
        PrintSeperator(30);
        System.out.println(prompt);
        PrintSeperator(30);
    }

    //Clears the console for the previous information
    public static void ClearConsole(){
        for(int i = 0; i < 100; i++) {
            System.out.println();
        }
    }

    //Makes the user take action before the console will be cleared
    public static void PressAnythingToContinue() {
        System.out.println("Press anything to continue");
        scanner.nextLine();
        ClearConsole();
    }
}
