/*Online Java Paper Test Project*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class OnlineTest extends JFrame implements ActionListener
{
	JLabel l, l1, l2;
	JRadioButton jb[]=new JRadioButton[5];
	JButton b1,b2,b3;
	ButtonGroup bg;
	JProgressBar jp;
	int count=0,current=0,x=1,y=1,now=0, i=0,num=0;
	int m[]=new int[10];	
	OnlineTest(String s)
	{
		super(s);
		l=new JLabel();
		l1= new JLabel();
		l2= new JLabel();
		jp=new JProgressBar(0,2000);    //to set vertical (SwingConstants.VERTICAL,0,2000)
		jp.setBounds(150,10,160,30);
		jp.setValue(0);    
		jp.setStringPainted(true);
		add(jp);
		add(l);
		add(l1);
		add(l2);
		bg=new ButtonGroup();
		for(int i=0;i<5;i++)
		{
			jb[i]=new JRadioButton();	
			add(jb[i]);
			bg.add(jb[i]);
		}
		b1=new JButton("Next");
		b2=new JButton("Bookmark");
		b3= new JButton("Prev");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		add(b1);
		add(b2);
		add(b3);
		set();
		l.setBounds(30,40,450,20);
		l1.setBounds(20, 280, 450,30);
		l2.setBounds(500, 35, 40, 40);
		
		jb[0].setBounds(50,80,100,20);
		jb[1].setBounds(50,110,100,20);
		jb[2].setBounds(50,140,100,20);
		jb[3].setBounds(50,170,100,20);
		b1.setBounds(150,240,100,30);
		b2.setBounds(320,240,100,30);
		b3.setBounds(20,240,100,30);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setLocation(250,100);
		setVisible(true);
		setSize(600,350);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			if(current<10)
			l2.setText((current+2)+ "/10");
			
			if(check())
				count=count+1;
			if(current==10)
				current=10;
			else if(current<11)
			current++;
			iterate();
			set();	
			if(current==9)
			{
				//b1.setEnabled(false);
				b2.setText("Result");
			}
			else
			{
				b1.setEnabled(true);
				b1.setSelected(true);
				b1.setVisible(true);
			}
			
		}
		if(e.getSource()== b3)
		{
			l2.setText(current+ "/10");
			
			if(current>0){
			current--;
			count--;}
			iterate();
			set();
			
		}
		if(e.getActionCommand().equals("Bookmark"))
		{
			JButton bk=new JButton("Bookmark"+x);
			bk.setBounds(480,50+30*x,100,30);
			add(bk);
			bk.addActionListener(this);
			m[x]=current;
			x++;
			current++;
			set();	
			if(current==9)
				b2.setText("Result");
			setVisible(false);
			setVisible(true);
		}
		for(int i=0,y=1; i<x ;i++,y++)
		{
			if(e.getActionCommand().equals("Bookmark"+y))
			{
				if(check())
					count=count+1;
				now=current;
				current=m[y];
				set();
				((JButton)e.getSource()).setEnabled(false);
				current=now;
			}
		}
	
		if(e.getActionCommand().equals("Result"))
		{
			if(check())
				count=count+1;
			current++;
			//System.out.println("correct ans="+count);
			if(count<0)
				JOptionPane.showMessageDialog(this,"You have score: 0");
			else
				JOptionPane.showMessageDialog(this,"You have score: "+count);
			System.exit(0);
		}
	}
	void set()
	{
		l2.setText( (current+1) + "/10");
		jb[4].setSelected(true);
		
		
		if(current==0)
		{
			l.setText("Que1: Which one among these is not a datatype");
			jb[0].setText("int");jb[1].setText("Float");jb[2].setText("boolean");jb[3].setText("char");	
			
		}
		if(current==1)
		{
			l.setText("Que2: Which class is available to all the class automatically");
			jb[0].setText("Swing");jb[1].setText("Applet");jb[2].setText("Object");jb[3].setText("ActionEvent");
		}
		if(current==2)
		{
			l.setText("Que3: Which package is directly available to our class without importing it");
			jb[0].setText("swing");jb[1].setText("applet");jb[2].setText("net");jb[3].setText("lang");
		}
		if(current==3)
		{
			l.setText("Que4: String class is defined in which package");
			jb[0].setText("lang");jb[1].setText("Swing");jb[2].setText("Applet");jb[3].setText("awt");
		}
		if(current==4)
		{
			l.setText("Que5: What is the size of the \'char\' datatype");
			jb[0].setText("1 Byte");jb[2].setText("2 Byte");jb[1].setText("Depend upon compiler");jb[3].setText("none of the above");
		}
		if(current==5)
		{
			l.setText("Que6: Which one among these is not a keyword");
			jb[0].setText("class");jb[1].setText("int");jb[2].setText("get");jb[3].setText("if");
		}
		if(current==6)
		{
			l.setText("Que7: Which one among these is not a class ");
			jb[0].setText("Swing");jb[1].setText("Actionperformed");jb[2].setText("ActionEvent");jb[3].setText("Button");
		}
		if(current==7)
		{
			l.setText("Que8: which one among these is not a function of Object class");
			jb[0].setText("toString");jb[1].setText("finalize");jb[2].setText("equals");jb[3].setText("getDocumentBase");		
		}
		if(current==8)
		{
			l.setText("Que9: which function is not present in Applet class");
			jb[0].setText("init");jb[1].setText("main");jb[2].setText("start");jb[3].setText("destroy");
		}
		if(current==9)
		{
			l.setText("Que10: Which one among these is not a valid component");
			jb[0].setText("JButton");jb[1].setText("JList");jb[2].setText("JButtonGroup");jb[3].setText("JTextArea");
		}
		l.setBounds(30,40,450,20);
		for(int i=0,j=0;i<=90;i+=30,j++)
			jb[j].setBounds(50,80+i,200,20);
	}
	boolean check()
	{
		if(current==0)
			return(jb[1].isSelected());
		if(current==1)
			return(jb[2].isSelected());
		if(current==2)
			return(jb[3].isSelected());
		if(current==3)
			return(jb[0].isSelected());
		if(current==4)
			return(jb[2].isSelected());
		if(current==5)
			return(jb[2].isSelected());
		if(current==6)
			return(jb[1].isSelected());
		if(current==7)
			return(jb[3].isSelected());
		if(current==8)
			return(jb[1].isSelected());
		if(current==9)
			return(jb[2].isSelected());
		return false;
	}
	public void iterate()
	{    
		//while(current<=10)
		  i= current*200;  
		  jp.setValue(i);    
		  
		  //try{Thread.sleep(150);}catch(Exception e){}    
		    
	}    
	public static void main(String s[])
	{
		OnlineTest on =new OnlineTest("Online Test Of Java");
		on.setVisible(true);
		on.iterate();
	}


}