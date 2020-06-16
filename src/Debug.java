import java.util.Scanner;

public class Debug {
    public static void main(String[] args) {

        //create scanner class/FIX system out to IN
        Scanner input = new Scanner(System.in);

        //print user prompt/ FIX to System.out.print
        System.out.print("Input your name: ");

        //store input in String variable called name/ FIX change to input.nextLine(): for string
        String name = input.nextLine();

        //prompt user for age / FIX wrap string literal in quotes
        System.out.print("Enter your age: ");

        //store input in String variable called age / Fix case convention for naming variables
        //purposefully storing age as a String rather than int
        //don't need buffer for next String
        String age = input.nextLine();

        //prompt user for DOB
        System.out.print("Enter your DOB year: ");

        //store input in int / change nextLine() to nextInt() to store int variable
        int dob = input.nextInt();

        System.out.println("Summary: " + "Your name is: " + name + "\n" + "Your age is: " + age + "\n" + "Your birth year is: " + dob);
    }
}       //added closing brackets for main method and class respectively