import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class AppletEventHandler extends Applet
{
	Label l1,l2,l3;
	TextField t1,t2;
	Button b1,b2,b3,b4;
	public void init()
	{
		l1=new Label(" First Number ");
		l2=new Label(" Second Number ");
		l3=new Label();
		
		t1=new TextField();
		t2=new TextField();
		b1=new Button(" ADD ");
		b2=new Button(" SUB ");
		b3=new Button(" MULTI");
		b4=new Button(" DIV ");
		
		setLayout(null);
		l1.setBounds(30,50,100,20);
		l2.setBounds(30,100,100,20);
		t1.setBounds(150,50,100,20);
		t2.setBounds(150,100,100,20);
		b1.setBounds(80,150,80,20);
		b2.setBounds(140,150,80,20);
		b3.setBounds(220,150,80,20);
		b4.setBounds(290,150,80,20);
		l3.setBounds(70,190,80,20);
		
		add(l1);
		add(l2);
		add(t1);
		add(t2);
		add(b1);
		add(l3);
		add(b2);
		add(b3);
		add(b4);
		
		b1.addActionListener(new MyEventHandler());
		b2.addActionListener(new MyEventHandler1());
		b3.addActionListener(new MyEventHandler2());
		b4.addActionListener(new MyEventHandler3());
	}
	public class MyEventHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int a,b,add;
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			add=a+b;
			l3.setText("Add= "+ sub);
			Button b5;
			b5=new Button(" Science ");
			b5.setBounds(350,150,80,20);
			add(b5);
		}
	}
	public class MyEventHandler1 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int a,b,sub;
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			sub=a-b;
			l3.setText("Sub= "+ sub);
		}
	}
	public class MyEventHandler2 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int a,b,multi;
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			multi=a*b;
			l3.setText("Multi= "+ multi);
		}
	}
	public class MyEventHandler3 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			double a,b,div;
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			div=a/b;
			l3.setText(" Divsion"+ div);
		}
	}
}

/*
<applet code="AppletEventHandler" width=400 height=300>
</applet>
*/