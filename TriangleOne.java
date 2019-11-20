//Name:
//Date:
//Per:
//AP Comp Sci

import static java.lang.System.*;
import java.util.Scanner;

public class TriangleOne
{
	public static String createTriangle(String let, int size)
	{
		String output="";
		for (int i = 1; i <= size; i++)
		{
			for (int j = 0; j < i; j++)
			{
				output = output + let;
			}
			output = output + "\n";
		}
		return output;
	}
}
