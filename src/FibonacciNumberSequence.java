import java.util.Scanner;

// Writing a program using scanner class to find the fibonacci number sequence upto the user input number
public class FibonacciNumberSequence
{

    // Creating object for Scanner class to take input
    Scanner scanner=new Scanner(System.in);



    public static void main(String[] args)
    {

        // creating class object to call non-static method to static area
        FibonacciNumberSequence fibonacciNumberSequence=new FibonacciNumberSequence();

        // calling the method using class object
        fibonacciNumberSequence.printFibonacciSequence();

    }



    // No return type no parameters
    public void printFibonacciSequence()
    {

        // message to user for what to enter
        System.out.println("Please input a number to see Fibonacci number sequence upto your number");

        // storing variable using scanner object
        int n=scanner.nextInt();

        // storing and initializing the variables
        int a=0,b=1,nextnum;

        // message to be displayed to the user with the output
        System.out.println("Fibonacci number sequence upto your number "+ n+ " is:" );

        // using forloop to find the fibonacci number sequence
        for (int i = 1; i <= n; i++)
        {



            if (i<=1)
            {
                System.out.println(i);


            }else
            {
                nextnum=a+b;
                if (nextnum>n)
                    break;
                a=b;
                b=nextnum;
                System.out.println(nextnum);
            }

        }
    }
}
