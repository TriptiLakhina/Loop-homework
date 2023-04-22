import java.util.Scanner;

// Writing a program using scanner class to count number of 'a' in the string input by user.
public class A_Count_In_String
{
    // Creating object for Scanner class to take input
    Scanner scanner=new Scanner(System.in);


    public static void main(String[] args)
    {
        // creating class object to call non-static method to static area
        A_Count_In_String a_count_in_string = new A_Count_In_String();

        //calling the method using class object
        a_count_in_string.countTotalNumberOfA();
    }



    // No return type no parameters
    public void countTotalNumberOfA()
    {
        // message to user for what to enter
        System.out.println("\nEnter any word/s or sentence/s");

        //Storing variables using scanner object
        String sentence=scanner.nextLine();

        // Storing and Initializing the variables
        int count=0;
        int charCount = sentence.length() - sentence.replaceAll("a", "").length();

        //using forloop to count occurrence of 'a' in the string input.
        for (int i = 0; i <= charCount; i++)
        {
            if (sentence.charAt(i) != ' ')          //writing a condition to go to count increment & print output only if string/character input is not blank.
                count++;


            // Writing print command for required output
        } System.out.println("Total number of character 'a' in your string" + " \"" + sentence + "\" "+ "are: "+ count);
    }
}
