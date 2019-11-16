import java.util.Scanner;

public class ValidInt {


    private int MinAcceptedValue;

    private int MaxAcceptedValue;

    private String output;


    public ValidInt(int min, int max) {

        MinAcceptedValue = min;

        MaxAcceptedValue = max;

//Define Scanner
    }

    public int getValue() {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter an integer value");

        int n = keyboard.nextInt();

        while (n < MinAcceptedValue && n > MaxAcceptedValue) {

            System.out.println("Error: given number not is in range: Try again");

            System.out.println("Enter an integer value");

            n = keyboard.nextInt();

        }

        return n;

    }
}
