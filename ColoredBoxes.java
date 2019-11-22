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

int w = 20;
int h = 20;
int t = 40;
for (int x = 40; x <= 800; x+=30) {
   window.fillRect( x, t, w, h );
	 for (t = 40; t <= 800; t+=30)
	 {
		 window.fillRect( x, t, w, h );
	 }
 }


	}
}
