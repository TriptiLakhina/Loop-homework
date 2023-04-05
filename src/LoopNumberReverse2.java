import java.util.Scanner;

// Writing a program using scanner class to reverse the user input number
public class LoopNumberReverse2
{

    // Creating object for scanner class to take input
    Scanner scanner=new Scanner(System.in);

    public static void main(String[] args)
    {
        // Creating class object to call non-static method to static area
        LoopNumberReverse2 loopNumberReverse2 = new LoopNumberReverse2();

        // calling the method using class object
        loopNumberReverse2.reverseTheNumber();

    }



    // No return type no parameters
    public void reverseTheNumber()
    {
        // message to user for what to enter
        System.out.println("Please enter a number to reverse");

        //Storing variable using scanner object
        int number= scanner.nextInt();

        // Storing and Initializing the variable
        int reverse = 0;


        // using forloop to reverse the number
        for(int i = 0; number != 0; i++)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number=number/10;
        }

        // Writing print command for required output
        System.out.println("The reverse of the given number is: " + reverse);

    }
}
