public class MachineDice {

    public static void MachinesTurn() {
        ConsoleOperators.DisplayInfo("Machine says: \nNow it is my time");
        int machineFirstHand = ThrowDice.DiceValueMultipleTwo();
        System.out.println("My first hit was: " + machineFirstHand);

        do{
           int sum = ThrowDice.DiceValue() + machineFirstHand;
            System.out.println("Machine says: \nMy current dice value: " + sum);
            machineFirstHand = sum;
        }  while (machineFirstHand <= 18);
    }
}
