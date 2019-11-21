//Name:
//Date:
//Per:
//AP Comp Sci

import static java.lang.System.*;

public class TriangleFour
{
   private int size;
   private String letter;

	public TriangleFour()
	{
    setTriangle(0, "");
	}

	public TriangleFour(int count, String let)
	{
    setTriangle(count, let);
	}

	public void setTriangle(int count, String let)
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
    for (int i = 0; i <= size; i++)
    {
      //Line and length
      for (int j = size; j > (size - i); j--)
      {
        output += " ";
      }

      for (int k = (size-i); k > 0; k--)
      {
        output += getLetter();
      }


      output += "\n";

   }
		return output;
	}
}
