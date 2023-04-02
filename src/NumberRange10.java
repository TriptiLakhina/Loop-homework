import java.util.Scanner;

public class NumberRange10
{

    Scanner scanner=new Scanner(System.in);




    public static void main(String[] args )
    {
        NumberRange10 numberRange10=new NumberRange10();
        numberRange10.print10numbers();

    }




    public void print10numbers()
    {
        System.out.println("Please write 2 numbers to provide a range of 10 numbers ex 23-33 pressing. Please press enter after each input. ");

        int rangenumber1 = scanner.nextInt();
        int rangenumber2 = scanner.nextInt();



        for (int i = rangenumber1; (i <= rangenumber2) && (rangenumber1 + 10 == rangenumber2); i++)
        {
            System.out.println(i);

        }
        if (rangenumber1 + 10 == rangenumber2)
        {
            System.out.println(" ");
        } else {
            System.out.println("Invalid entry. Please enter a valid range of 10 numbers");
        }

    }
}
