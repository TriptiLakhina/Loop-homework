import java.util.Scanner;

// Writing a program using scanner class to find the factorial of a number input by the user
public class FactorialNumber {

    // Creating object for Scanner class to take input
    Scanner scanner = new Scanner(System.in);

    public static void main(String []args)
    {
        // creating class object to call non-static method to static area
        FactorialNumber factorialNumber=new FactorialNumber();

        //calling the method using class object
        factorialNumber.findFactorialNumber();


    }


    // No return type no parameters
    public void findFactorialNumber()

    {
        // message to user for what to enter
        System.out.println("Enter the number: ");

        //Storing variables using scanner object
        int num = scanner.nextInt();

        //Declare and Initialize the variable
        int factorialnumber = 1;

        // using forloop to find the factorial of the number
        for (int i = 1; i <= num; i++) {
            factorialnumber = factorialnumber * i;
        }

        // Writing print command for required output
        System.out.println("Factorial of the number: " + factorialnumber);
    }
}
