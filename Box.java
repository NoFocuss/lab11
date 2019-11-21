//Name:
//Date:
//Per:
//AP Comp Sci

import static java.lang.System.*;

public class Box
{
   private int size;

	public Box()
	{
    setSize(0);
	}

	public Box(int count)
	{
    setSize(count);
	}

	public void setSize(int count)
	{
    size = count;
	}

	public int getSize()
	{
		return size;
	}

	public String toString()
	{
		String output="";
    for (int i = 1; i <= getSize(); i++)
    {
      //Line and length
      for (int j = (getSize() - i); j >= 0 ; j--)
      {
        output += "*";
      }

      for (int k = (getSize()-i); k < getSize(); k++)
      {
        output += "#";
      }


      output += "\n";

   }
		return output;
	}
}
