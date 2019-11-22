//Name:
//Date:
//Per:
//AP Comp Sci

import static java.lang.System.*;

class PyramidWord
{
   private String word;

	public PyramidWord()
	{
    setWord("");
	}

	public PyramidWord(String w)
	{
    setWord(w);
	}

	public void setWord(String w)
	{
    word = w;
	}

	public String toString()
	{
		String output="";
    int i = word.length()*2-1;
    StringBuilder builder = new StringBuilder(word);


    String built = "" + builder.reverse();
    built += word.substring(1, word.length());
    StringBuilder news = new StringBuilder(built);
    String fin = news.toString();

    for (int increment = 0; increment < word.length()-1; increment++) //THIS MEANS LOOP ONCE PER CHARACTER IN WORD
    {

        for (int repl = 0; repl <= news.length()-1; repl++)
        {
            char c = 32;
            news.setCharAt(repl, c);
            news.setCharAt((word.length()-increment), word.charAt(increment));
            news.setCharAt((word.length()+increment), word.charAt(increment));

        }
        output += news.toString() + "\n";




      }
output += " " +fin;



		return output;
	}
}
