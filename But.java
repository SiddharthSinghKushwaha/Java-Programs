import java.io.*;
import java.awt.*;
import java.awt.event.*;
class But extends Frame
{
	But()
	{
		Button b=new Button("ok");
		add(b);
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				System.exit(0);
			}
		});
	}
	public static void main(String[] args)
	{
		But obj=new But();
		obj.setSize(400,300);
		obj.setVisible(true);
	}
}
