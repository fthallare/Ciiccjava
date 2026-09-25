
import java.util.Scanner;
class Task5{

public static void main  (String[] args ){
    Scanner in = new Scanner (System.in);

    System.out.println("Enter Three Number:");
    int num1 = in.nextInt();
    int num2 = in.nextInt();
    int num3 = in.nextInt();

    if (num1 == num2 && num2 == num3){
      System.out.println("All numbers are equal.");
    }
    else if (num1>=num2 && num1>= num3){
        System.out.println("the largest number is:"+ num1);
    }
    else if (num2 >=num1 && num2 >=num3 ){
        System.out.println("the largest number is:"+ num2);
    }
    else {
        System.out.println("the largest number is:"+num3);
    }
     
 
    in.close();
}
   


}