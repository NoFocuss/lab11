//Name:
//Date:
//Per:
//AP Comp Sci

import static java.lang.System.*;
import java.util.Scanner;
public class TriangleThreeRunner
{
   public static void main( String args[] )
   {
     Scanner in = new Scanner(System.in);
     String choice="";
     do
     {
       out.print("Enter the size of the triangle : ");
       int big = in.nextInt();
       out.print("Enter a letter : ");
       String value = in.next();

         //static methods can be called using the class name
       TriangleThree test = new TriangleThree(value, big);
       out.println(test);

       System.out.print("Do you want to enter more data? ");
       choice=in.next();
     }
     while(choice.equals("Y")||choice.equals("y"));
   }
}
