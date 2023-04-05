import java.util.Scanner;

// Writing program using scanner class to calculate the sum of x ranging from 1-20 where x is a number input by the user
public class XSum1To20
{
    // Creating object for scanner class to take the input
Scanner scanner=new Scanner(System.in);
    public static void main (String[]args)
    {
        // Creating class object to call non-static method to static area
        XSum1To20 xSum1To20=new XSum1To20();

        // calling method using class object
        xSum1To20.checkSum();

    }



    public void checkSum()
    {
        // message to user for what to enter
        System.out.println("Enter an integer number from range 1-20 ");

        // Storing variable using scanner object
        int a = scanner.nextInt();

        // Storing & initializing the variable
        int sum = 0;

        // using if-else to print output only if the user input number is in the range of 1-20
        if ((a<=20) && (a>0))
        {
            // using forloop to find the sum of all numbers upto the user input number ranging from 1-20
            for (int x = 0; x <= a; x++)
                sum = sum + x;
            System.out.println ("The sum of " +a+ " is " + sum);

        }else
        {
            System.out.println("Invalid entry. Please input number from range 1-20.");
        }

    }

}
