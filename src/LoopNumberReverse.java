import java.util.Scanner;

// Writing a program using scanner class to reverse the user input number
public class LoopNumberReverse
{
    // Creating object for scanner class to take input
    Scanner scanner=new Scanner(System.in);

    public static void main(String[] args)
    {
        // Creating class object to call non-static method to static area
        LoopNumberReverse loopNumberReverse=new LoopNumberReverse();

        // calling the method using class object
        loopNumberReverse.reverseTheNumber();

    }



    // No return type no parameters
    public void reverseTheNumber()
    {
        System.out.println("Please enter a number to reverse");

        int number= scanner.nextInt();
        int reverse = 0;


        // using forloop to reverse the number - without mentioning the initialization & increment part of the forloop as it is not being used
        for(;number != 0;)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number=number/10;
        }

        // Writing print command for required output
        System.out.println("The reverse of the given number is: " + reverse);

    }
}
