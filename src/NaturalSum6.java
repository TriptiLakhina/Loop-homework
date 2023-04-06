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
            System.out.println("\nEnter any natural number");

            // Storing variable using scanner object
            int numn = scanner.nextInt();

            // storing and initializing the variable
            int sum = 0;

            // using forloop to get the sum of all natural numbers upto the user input number
            for (int i = 0; i <= numn; i++)
            {
                sum += i;
            }

            // Writing condition to print sum of all the numbers upto user input number if the number is a natural number i.e., greater than O
            if (numn>0)
            {
                System.out.println("\nSum of all the naturals numbers upto your number "+numn+ " = " +sum);
            }

            // print command if the number entered by user is not a natural number
            else
            {
                // writing the print command for the required output i.e., sum
                System.out.println("Invalid entry, please enter a natural number i.e., a positive whole number.");
            }

        }

}