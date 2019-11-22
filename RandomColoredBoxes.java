//Name:
//Date:
//Per:
//AP Comp Sci

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;
import javax.swing.JPanel;

public class RandomColoredBoxes extends JPanel
{
	private Timer timer;
	private final static int SLEEP = 110;

	public RandomColoredBoxes()
	{
		setBackground(Color.BLACK);
		setVisible(true);

		ActionListener paintCaller = new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
				repaint();
			}
		};
		timer = new Timer(SLEEP, paintCaller);
		timer.start();
	}

	public void paintComponent( Graphics window )
	{
		super.paintComponent(window);

		window.setColor(Color.RED);
		window.setFont(new Font("TAHOMA",Font.BOLD,12));
	  	window.drawString("Graphics Lab Lab11k ", 20, 40);
	  	window.drawString("Drawing boxes with nested loops ", 20, 80);

	  	drawBoxes(window);
	}

	public void drawBoxes(Graphics window)
	{
		//for loop to to across the x - getWidth() might be useful

			//for loop to go down the y - getHeight() might be useful

				//draw random colored boxes
				int w = 20;
				int h = 20;
				int t = 40;
				for (int x = 40; x <= 800; x+=30)
				{

						for (t = 40; t <= 800; t+=30)
						{
							int R = (int) (Math.random( )*256);
							int G = (int)(Math.random( )*256);
							int B= (int)(Math.random( )*256);
							Color randomColor = new Color(R, G, B);
							window.setColor(randomColor);
								window.fillRect( x, t, w, h );
						}
				}
	}
}
