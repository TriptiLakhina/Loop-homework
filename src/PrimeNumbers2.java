import java.util.Scanner;
// Writing a program using scanner class to see if the user input number is a prime number
// used No return type and no parameters method by own r&d (google had it with return type and with parameter
public class PrimeNumbers2
{
    Scanner scanner = new Scanner(System.in);


    public static void main(String[] args)
    {
             PrimeNumbers2 primeNumbers2=new PrimeNumbers2();
             primeNumbers2.checkPrimeNumber();

    }


    public void checkPrimeNumber()
    {

        System.out.println("Please enter a number to check if it is a prime number");
        int number = scanner.nextInt();
        int printed=0;
        int squareroot = (int) Math.sqrt(number);


            for (int i=1; number >=1 ; i++)
            {
                if ((number != 2) && (number != 3) && (number != 5) && (number % 2 == 0 || number == 1 || (Math.pow(squareroot, 2) == number) || number % 3 == 0 || number % 5 == 0)) {
                    System.out.println(number + " is not a prime number");
                    if (printed == 0) ;
                    break;
                } else if (number % number == 0) {
                    System.out.println(number + " is a prime number");
                    if (printed == 0) ;
                    break;
                }

            }

    }
}