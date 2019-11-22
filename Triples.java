//Name:
//Date:
//Per:
//AP Comp Sci

import static java.lang.System.*;
import java.lang.Math;
public class Triples
{
   private int number;

	public Triples()
	{
		setNum(0);
	}

	public Triples(int num)
	{
    setNum(num);
	}

	public void setNum(int num)
	{
    number = num;
	}

	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 1;
    return max;
  }

	public String toString()
	{
		String output="";
    int a, b, c = 0;
    int j = 2;
    while (c < number)
    {
      for (int i = 1; i < j; ++i)
      {
        a = (j * j) - (i * i);
        b = 2 * j * i;
        c = (j * j) + (i * i);
        if (c > number)
        {
          break;
        }
        if (a % b == 0)
        {
          break;
        }
        output += (a + " " + b + " " + c + "\n");
      }
      j++;
    }
		return output;
	}

}
