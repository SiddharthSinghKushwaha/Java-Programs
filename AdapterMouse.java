import java.awt.*;
import java.awt.event.*;
public class AdapterMouse
{
	Frame f;
	AdapterMouse()
	{
		f=new Frame("My name Adapter Mouse ");
		f.addMouseListener(new MyMouse());
		f.addWindowListener(new MyWindow());
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}
	class MyWindow extends WindowAdapter
	{
		public void windowClosing(WindowEvent e)
		{
			System.out.println("Window closing...");
		}
		public void windowClosed(WindowEvent e)
		{
			System.out.println("Window closed...");
		}
	}
	class MyMouse extends MouseAdapter
	{
		public void mouseClicked(MouseEvent e)
		{
			Graphics g=f.getGraphics();
			g.setColor(Color.BLUE);
			g.fillOval(e.getX(), e.getY(), 30,30);
		}
	}
	public static void main(String args[])
	{
		new AdapterMouse();
	}
}