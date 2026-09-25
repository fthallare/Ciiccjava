
import java.util.Scanner;
class Task4{

public static void main  (String[] args ){

    Scanner in = new Scanner (System.in);
   System.out.print("Enter a phrase: ");
   String originalInput = in.nextLine();

   String inputString = originalInput;
   StringBuilder sb = new StringBuilder(inputString);
   String reversedString = sb.reverse().toString();
 if (inputString.equals(reversedString)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }
    in.close();
}
   


}