//Name:
//Date:
//Per:
//AP Comp Sci

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
    setTriangle("", 0);
	}

	public TriangleThree(String let, int count)
	{
    setTriangle(let, count);
	}

	public void setTriangle(String let, int count)
	{
    letter = let;
    size = count;
	}

	public String getLetter()
	{
		return letter;
	}

	public String toString()
	{
		String output="";

    for (int i = 1; i <= size; i++)
    {
      //Line and length
      for (int j = 1; j <= (size -i); j++)
      {
        output += " ";
      }
      
      for (int k = 1; k <= i; k++)
      {
        output += getLetter();
      }


      output += "\n";

   }
		return output;
	}
}
