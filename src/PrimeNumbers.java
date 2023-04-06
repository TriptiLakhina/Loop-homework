import java.util.Scanner;

// Writing a program using scanner class to check if the user input number is a prime number
public class PrimeNumbers
{



    public static void main(String[] args)
    {
        // Creating object from scanner class to take input
        Scanner scanner=new Scanner(System.in);

        // message to user for what to enter
        System.out.println("Please enter a number to check if it is a prime number");

        // Storing variable using scanner object
        int number=scanner.nextInt();

        // calling method to get the output
        if (checkPrimeNumber(number))
        {
            System.out.println(number + " is a prime number");
        }else
        {
            System.out.println(number+ " is not a prime number");
        }


    }


// with return type with parameters
    public static boolean checkPrimeNumber(int number)
    {

        if (number <= 1)
        {
            return false;
        }

        for (int i=2; i<=Math.sqrt(number);i++)
        {
            if (number%i==0)
            {
                return false;
            }
        }

        return true;
    }
}
