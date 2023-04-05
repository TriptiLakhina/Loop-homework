import java.util.Scanner;

// Writing a program using scanner class to find the sum of series 1+1/2+1/3+1/4+....+ 1/n i.e., user input number
public class PositiveIntegerSeriesSum
{
    // Creating object for scanner class to take input
    Scanner scanner = new Scanner(System.in);



    public static void main(String[] args)
    {
        // Creating class object to call non-static method to static area
        PositiveIntegerSeriesSum positiveIntegerSeriesSum = new PositiveIntegerSeriesSum();

        // calling method using class object
        positiveIntegerSeriesSum.calculateSeriesSum();

    }



    void calculateSeriesSum()
    {
        // message to user for what to enter
        System.out.println("Enter a positive integer number");

        // storing variable using scanner object
        int number = scanner.nextInt();

        // Declare and initialize a variable to store the sum
        double sum = 0;


        if (number > 0)
        {
            // using forloop to get the sum of the series
            for (int i = 1; i <= number; i++)
            {
                sum += (1.0 / i);           // add the next fraction to the sum


            }

            // print command to get the output if number is a positive integer
            System.out.println("The sum of the series 1 + 1/2 + 1/3 + ...... + 1/" + number + " = " + sum);


        } else
        {
            // print command if the number is not a positive integer
            System.out.println("Invalid entry. Please enter a positive integer number");
        }
    }
}
