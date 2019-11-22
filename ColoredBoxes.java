//Name:
//Date:
//Per:
//AP Comp Sci

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Canvas;

class ColoredBoxes extends Canvas
{
	public ColoredBoxes()
	{
		setBackground(Color.WHITE);
	}

	public void paint( Graphics window )
	{
		window.setColor(Color.RED);
		window.setFont(new Font("TAHOMA",Font.BOLD,12));
	  	window.drawString("Graphics Lab", 20, 40 );
	  	window.drawString("Drawing boxes with nested loops ", 20, 80 );

	  	drawBoxes(window);
	}

	public void drawBoxes(Graphics window)
	{

		int pix = 10;
		int w = pix;
		int h = pix;

		for (int x = 0; x <= getWidth(); x+=pix)
		{

				for (int t= 100; t <= getHeight(); t+=pix)
				{
		 					window.fillRect( x, t, w, h );
	 				}
 			}
		}
}
