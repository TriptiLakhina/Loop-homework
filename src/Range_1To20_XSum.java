import java.util.Scanner;

// Writing program using scanner class to calculate the sum of x where x is a range input by the user ranging from 1-20
public class Range_1To20_XSum
{
    // Creating object for scanner class to take the input
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        // Creating class object to call non-static method to static area
        Range_1To20_XSum range_1To20_xSum = new Range_1To20_XSum();

        // calling method using class object
        range_1To20_xSum.checkSum();

    }



    public void checkSum()
    {
        // message to user for what to enter
        System.out.println("\nEnter 2 integer numbers from 1-20 to provide a range pressing enter after each input ");

        // Storing variables using scanner object
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        // Storing & initializing the variable to store the running total
        int sum_x = 0;


        // using forloop to find the sum of all the numbers in the range input by the user
        for (int i = number1; i <= number2; i++)
            sum_x = sum_x + i;

        // Applying condition to print sum if user input range is within 1-20
        if ((number1 <= 20) && (number1 > 0) && (number2 > 0) && (number2 <= 20))
        {

            System.out.println("The sum of all the numbers in your range " + number1 + "-" + number2 + " is " + sum_x);


        } else
        {

            System.out.println("Invalid entry. Please input number from range 1-20.");
        }
    }
}