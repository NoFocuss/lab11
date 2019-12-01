//Name:
//Date:
//Per:
//AP Comp Sci

import static java.lang.System.*;
import java.util.Scanner;
public class LettersAndNumbersRunner
{
   public static void main(String args[])
   {
     Scanner in = new Scanner(System.in);
     String choice="";
     do
     {
       out.print("Enter the letter: ");
       char c = in.next().charAt(0);
       out.print("Enter the amount: ");
       int num = in.nextInt();


         //static methods can be called using the class name
       LettersAndNumbers test = new LettersAndNumbers(c, num);
       out.println(test);

       System.out.print("Do you want to enter more data? ");
       choice=in.next();
     }
     while(choice.equals("Y")||choice.equals("y"));
	}
}
