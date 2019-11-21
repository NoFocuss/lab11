//Name:
//Date:
//Per:
//AP Comp Sci

import static java.lang.System.*;

class BoxWord
{
   private String word;

	public BoxWord()
	{
		setWord("");
	}

	public BoxWord(String s)
	{
    setWord(s);
	}

	public void setWord(String w)
	{
    word = w;
	}

	public String toString()
	{
		String output="";
    StringBuilder s = new StringBuilder(word);
    s=s.reverse();
    out.println("");
    for (int i = 0; i <= (word.length() - 1); i++)
    {
      if (i == 0)
        {
          output += word;
        }
      else if (i == (word.length() - 1))
        {
          output += s + "\n";
        }
      else
      {

        for (int j = i; word.charAt(j) == word.charAt(i) ; j++)
        {

          output += word.charAt(j);
          for (int k = 1; k <= (word.length() - 2); k++)
          {
            output += " ";
          }
          output += s.charAt(j);
        }
      }
      output +="\n";
    }
		return output;
	}
}
