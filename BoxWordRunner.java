//Name:
//Date:
//Per:
//AP Comp Sci

import static java.lang.System.*;
import java.util.Scanner;
public class BoxWordRunner
{
   public static void main( String args[] )
   {
     Scanner in = new Scanner(System.in);
     String choice="";
     do
     {
       out.print("Enter the size of the box: ");
       String big = in.nextLine();


         //static methods can be called using the class name
       BoxWord test = new BoxWord(big);
       out.println(test);

       System.out.print("Do you want to enter more data? ");
       choice=in.next();
     }
     while(choice.equals("Y")||choice.equals("y"));
	 }
}
