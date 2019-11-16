import java.util.Random;


public class Magic8ball {


    Random r = new Random();

    public String getAnswer() {


        int num = r.nextInt(8) + 1;
        if (num == 1)

            return "It is certain";

        else if (num == 2)

            return "It is decidedly so";

        else if (num == 3)

            return "Most likely";

        else if (num == 4)

            return "Signs point to yes";

        else if (num == 5)

            return "Reply hazy, try again";

        else if (num == 6)

            return "Ask again later";

        else if (num == 7)

            return "Donâ€™t count on it";

        else

            return "My sources say no";

    }
}