import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

public class Paint_Olimping_Rings extends JApplet
{
	public void paint(Graphics g)
	{
		OlimpicRings OlmRing = new OlimpicRings();
		OlmRing.PaintRings(g);
		//OlmRing.PaintRings(g, 150, 150, 200);
	}
} 