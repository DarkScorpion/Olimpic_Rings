import java.awt.Color;
import java.awt.Graphics;

public class Ring //extends JApplet
{
	int coordX, coordY;
	Color ColorName;
	int radius;
	
	//����������� ������ � �������� �� ���������
	public Ring(int X, int Y, Color clrName) 
	{
		coordX = X;
		coordY = Y;
		ColorName = clrName;
		radius = 100;
	}
	//������������ ������������ � �������������� ����������: ������
	public Ring(int X, int Y, Color clrName, int rad) 
	{
		coordX = X;
		coordY = Y;
		ColorName = clrName;
		radius = rad;
	}
	
	//����� �������� ���� � ���� ����������� � ��������� ��������
	public void paint(Graphics g)
	{
		//super.paint(g);
		g.setColor(ColorName);
		g.drawOval(coordX, coordY, radius, radius);
	}

}
