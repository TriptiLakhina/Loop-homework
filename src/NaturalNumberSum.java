import java.util.Scanner;

// Writing a program using scanner class to display the numbers and their sum for the user input natural number
public class NaturalNumberSum
{

    // Creating object for scanner class to take the input
    Scanner scanner=new Scanner(System.in);

    public static void main(String[] args)
    {

        // Creating class object to call non-static method to static area
        NaturalNumberSum naturalNumberSum=new NaturalNumberSum();

        // Calling method using class object
        naturalNumberSum.sumOfNaturalNumbers();

    }


    void sumOfNaturalNumbers()
    {
        // message to user for what to enter
        System.out.println("Enter any natural number");

        // Storing variable using scanner object
        int numn=scanner.nextInt();

        // Storing & initializing the variable
        int sum=0;

        // Writing the message to be displayed to the user with output if the number entered is a natural number
        if (numn>0)
        {
            System.out.println("\nHere is the list of all natural numbers upto your number " + numn + ":");
        }

        // using forloop to get the list & sum of all the natural numbers upto the user input number
        for (int i = 1;i<=numn; i++)
        {
            sum+=i;

            // print command to get the list of numbers upto the user input number
            System.out.println(i);


        }

        // Writing condition to print sum of all the numbers upto user input number if the number is a natural number i.e., greater than O
        if (numn>0)
        {
        System.out.println("\nSum of all above listed "+numn+ " natural numbers = " +sum);
        }

        // print command if the number entered by user is not a natural number
        else if (numn<=0)
        {
            System.out.println("Invalid entry, please enter a natural number i.e., a positive whole number.");
        }

    }

}
