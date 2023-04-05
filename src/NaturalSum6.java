import java.util.Scanner;

// Writing a program using scanner class to find the sum of all natural numbers upto the number input by the user
public class NaturalSum6
{

    // Creating object from scanner class to take the input
        Scanner scanner = new Scanner(System.in);

        public static void main(String[] args)
        {

            // Creating class object to call non-static method to static area
            NaturalSum6 naturalSum6 = new NaturalSum6();

            // Calling method using scanner object
            naturalSum6.sumOfNaturalNumbers();

        }


        void sumOfNaturalNumbers()
        {
            // message to user for what to enter
            System.out.println("Enter any number");

            // Storing variable using scanner object
            int numn = scanner.nextInt();

            // storing and initializing the variable
            int sum = 0;

            // using forloop to get the sum of all natural numbers upto the user input number
            for (int i = 0; i <= numn; i++)
            {
                sum += i;
            }


            // writing the print command for the required output i.e., sum
            System.out.println("Sum of all natural number upto number " + numn + " = " + sum);

        }

}