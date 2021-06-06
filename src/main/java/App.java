import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //instances
        App myApp = new App();
        BACLevel BAC = new BACLevel();

        //input
        myApp.input(BAC);

        //calculate and print response
        BAC.setBacLevel(BAC.calculate());

        //output
        myApp.output(BAC.getBacLevel());
    }

    public void input(BACLevel BAC)
    {
        //gender
        System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
        BAC.setGender(input.nextInt());

        //alcohol amount
        System.out.print("How many ounces of alcohol did you have? ");
        BAC.setAlcoholConsumed(input.nextDouble());

        //weight
        System.out.print("What is your weight, in pounds? ");
        BAC.setWeight(input.nextDouble());

        //hours
        System.out.print("How many hours has it been since your last drink? ");
        BAC.setHours(input.nextDouble());
    }

    public void output(double BACLevel)
    {
        DecimalFormat df = new DecimalFormat("#0.000000");

        String out = (BACLevel >= .08)? "Your BAC is " + df.format(BACLevel) + "\nIt is not legal for you to drive":
                "Your BAC is " + df.format(BACLevel) + "\nIt is legal for you to drive.";
        System.out.println(out);
    }
}


