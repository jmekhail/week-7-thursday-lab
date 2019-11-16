import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Magic8ball m8b = new Magic8ball();

        System.out.println("Think of a question and I'll tell you your Magic 8 Ball answer ...");

        Scanner keyboard = new Scanner(System.in);

        String q = keyboard.nextLine();

        System.out.println(m8b.getAnswer());

        System.out.println("The Magic 8 Ball thanks you for asking!");



    }
}
