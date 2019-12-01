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


    for (int i = 1; i <= amount; i++ ) //how many lines
    {
      StringBuilder str = new StringBuilder();
      int letterVal = letter;

      for (int j = amount; j > 0 ; j--) //contents of each line
      {
        char fakeLetter = (char)letterVal;

        for (int k = j; k > 0; k--) // each box
        {
          str.append(fakeLetter);
        }

        if(j != 1)
        {
          str.append(" ");
        }

        letterVal -= 1;
        if (letterVal < 65 )
        {
          letterVal = 90;
        }



        }
        for (int l = 1; l < i; l++)
        {

          str.delete(str.lastIndexOf(" "), (str.length()));

        }
      output += str;
      output += "\n";

    }
		return output;
	}
}
