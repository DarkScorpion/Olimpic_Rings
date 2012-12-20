import java.awt.Color;
import java.awt.Graphics;

public class Ring //extends JApplet
{
	int coordX, coordY;
	Color ColorName;
	int radius;
	
	//Конструктор класса с радиусом по умолчанию
	public Ring(int X, int Y, Color clrName) 
	{
		coordX = X;
		coordY = Y;
		ColorName = clrName;
		radius = 100;
	}
	//Перезагрузка конструктора с дополнительным параметром: радиус
	public Ring(int X, int Y, Color clrName, int rad) 
	{
		coordX = X;
		coordY = Y;
		ColorName = clrName;
		radius = rad;
	}
	
	//Метод рисующий круг в указ координатах с выбранным радиусом
	public void paint(Graphics g)
	{
		//super.paint(g);
		g.setColor(ColorName);
		g.drawOval(coordX, coordY, radius, radius);
	}

}
