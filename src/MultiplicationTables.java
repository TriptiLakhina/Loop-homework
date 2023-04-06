import java.util.Scanner;

// Writing a program using scanner class to print the times table of the number input by the user
public class MultiplicationTables
{
    // Creating object for scanner class to take input
    Scanner scanner=new Scanner(System.in);



    public static void main(String[]args)
    {
        // Creating class object to call non-static method to static area
        MultiplicationTables multiplicationTables=new MultiplicationTables();

        // Calling method using class object
        multiplicationTables.getMultiplicationTable();

    }



    public void getMultiplicationTable()
    {
        // message to user for what to enter
        System.out.println("Enter any Integer number to get its multiplication table");

        // Storing variable using scanner object
        int number=scanner.nextInt();


        // message to display to the user with the output
        System.out.println("\nMultiplication table for number "+ number+ " :");
        // using forloop to get the multiplication table
        for (int i=number; i<=number; i++)
        {
            for (int j = 1; j <= 12; j++)
            {
                System.out.println(i +" x " +j + " = " + i*j);

            }
        }

    }
}
