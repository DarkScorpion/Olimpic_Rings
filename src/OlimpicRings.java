import java.awt.Color;
import java.awt.Graphics;


public class OlimpicRings 
{
	//Конструктор класса по умолчанию
	public void PaintRings(Graphics g)
	{
		Ring BlueRing = new Ring(50,50,Color.blue);
		BlueRing.paint(g);
		
		Ring BlackRing = new Ring(120,50,Color.black);
		BlackRing.paint(g);
		
		Ring RedRing = new Ring(190,50,Color.red);
		RedRing.paint(g);
		
		Ring YellowRing = new Ring(90,90,Color.yellow);
		YellowRing.paint(g);
		
		Ring GreenRing = new Ring(160,90,Color.green);
		GreenRing.paint(g);
	}
	//Перезагрузка конструктора с дополнительными параметрами: стартовые координаты и радиус 
	//Плюс автоподбор размера
	public void PaintRings(Graphics g, int startX, int startY, int radius)
	{
		int d;
		int h = (int)(radius*0.7) ;
		Ring BlueRing = new Ring(startX,startY,
				Color.blue,radius);
		BlueRing.paint(g);
		
		Ring BlackRing = new Ring(startX+h,startY,
				Color.black,radius);
		BlackRing.paint(g);
		
		
		Ring RedRing = new Ring(startX+2*h,startY,
				Color.red,radius);
		RedRing.paint(g);
		
		d = (int) (radius*0.4);
		Ring YellowRing = new Ring(startX+d,startY+d,
				Color.yellow,radius);
		YellowRing.paint(g);
		
		Ring GreenRing = new Ring(startX+d+h,startY+d,
				Color.green,radius);
		GreenRing.paint(g);
	}

}
