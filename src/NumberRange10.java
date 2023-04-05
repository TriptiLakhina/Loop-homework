import java.util.Scanner;

// Writing a program using scanner class to print the numbers from the user input range of 10 numbers
public class NumberRange10
{

    // Creating object from scanner class to take the input
    Scanner scanner = new Scanner(System.in);


    public static void main(String[] args)
    {
        // Creating class object to call non-static method to static area
        NumberRange10 numberRange10 = new NumberRange10();

        // calling method using class object
        numberRange10.print10numbers();

    }


    public void print10numbers()
    {

        // message to user for what to enter
        System.out.println("Please write 2 numbers to provide a range of 10 numbers ex 1-10, pressing enter after each input. ");

        // Storing variables using scanner object
        int rangenumber1 = scanner.nextInt();
        int rangenumber2 = scanner.nextInt();


        // writing message to display to the user with the output only if the input range is of 10 numbers
        if (rangenumber1 + 9 == rangenumber2)
        {
            System.out.println("\nHere is the list of all the numbers in your range " + rangenumber1 + "-" + rangenumber2 + ":");

            // using forloop to get the list of numbers according to the user input range
            for (int i = rangenumber1; (i <= rangenumber2) && (rangenumber1 + 9 == rangenumber2); i++)
            {
                System.out.println(i);

            }
        }

        // message to print if incorrect range is entered by the user
        else
        {
            System.out.println("Invalid entry. Please enter a valid range of 10 numbers");
        }

    }
}

