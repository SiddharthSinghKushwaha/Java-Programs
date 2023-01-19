import java.applet.Applet;
import java.awt.*;
public class GraphicsDemo extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.drawString("Welcome", 50, 50);
		g.drawLine(20, 30, 20, 30);
		g.drawRect(70, 100, 30, 30);
		g.fillRect(170, 100, 30, 30);
		
		
		g.setColor(Color.pink);
		g.fillOval(170, 200, 30, 30);
		g.drawArc(90, 150, 30, 30, 0, 180);
		g.fillArc(270, 150, 30, 30, 0, 180);
	}
}

/*
<applet code="GraphicsDemo" width=400 height=300>
</applet>
*/