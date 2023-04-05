import java.util.Scanner;

// Writing a program using scanner class to find out month name from the month number input by the user
public class MonthsSwitch {

    // Creating object for scanner class to take input
    Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

        // Creating class object to call non-static method in static area
        MonthsSwitch monthsSwitch=new MonthsSwitch();

        // calling the method using class object
        monthsSwitch.findMonthName();

    }




    // no return type no parameters
    void findMonthName(){

        //acknowledge user what to input
        System.out.println("Enter any number from 1-12 to get the month name");

        // Storing variable using scanner class
        int number = scanner.nextInt();


        // using switch to get the month names according to the month numbers
        switch (number){
            case 1:
                System.out.println("Month number " +number+ " is January");
                break;

            case 2:
                System.out.println("Month number " +number+ " is February");
                break;

            case 3:
                System.out.println("Month number " +number+ " is March");
                break;

            case 4:
                System.out.println("Month number " +number+ " is April");
                break;

            case 5:
                System.out.println("Month number " +number+ " is May");
                break;

            case 6:
                System.out.println("Month number " +number+ " is June");
                break;

            case 7:
                System.out.println("Month number " +number+ " is July");
                break;

            case 8:
                System.out.println("Month number " +number+ " is August");
                break;

            case 9:
                System.out.println("Month number " +number+ " is September");
                break;

            case 10:
                System.out.println("Month number " +number+ " is October");
                break;

            case 11:
                System.out.println("Month number " +number+ " is November");
                break;

            case 12:
                System.out.println("Month number " +number+ " is December");
                break;

            default:
                System.out.println("Invalid entry, please enter a number only from 1-12 for month");

        }

    }
}
