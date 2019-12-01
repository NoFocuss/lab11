//Name:
//Date:
//Per:
//AP Comp Sci

import static java.lang.System.*;
import java.lang.StringBuilder;
public class LettersAndNumbers
{
   private char letter;
   private int amount;

	public LettersAndNumbers()
	{
    setLetter('A');
    setAmount(0);
	}

	public LettersAndNumbers(char c, int amt)
	{
    setLetter(c);
    setAmount(amt);
	}

	public void setLetter(char c)
	{
    letter = c;
	}

	public void setAmount(int amt)
	{
    amount = amt;
	}

	public String toString()
	{
		String output="";


    for (int i = amount; i > 0; i-- ) //how many boxes
    {
      StringBuilder str = new StringBuilder();
      int letterVal = letter;
      for (int j = amount; j > 0; j--) //contents of each line
      {

        char fakeLetter = (char)letterVal;
        for (int k = j; k > 0; k--) // each box
        {

          str.append(fakeLetter);
        }
        str.append(" ");
        letterVal -= 1;

        // how many lines
      }
      output += str;
      output += "\n";

    }
		return output;
	}
}
