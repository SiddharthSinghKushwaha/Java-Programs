import javax.swing.*;  
import java.awt.event.*;
import javax.swing.*;  
import java.awt.*;  // repeation doesnt give any error
import java.awt.event.*;
public class OptionPaneExample extends WindowAdapter 
{  
	JFrame f, f1;  
	JButton b;
	JTextArea ta;
	OptionPaneExample()
	{  
		f=new JFrame("Multiple example performed");  
		f1 = new JFrame();
		JOptionPane.showMessageDialog(f1, "Hello, Welcome to FastBookingSeat.");
		f.addWindowListener(this);  
		f.setSize(400, 400);  
		f.setLayout(null);  
		f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);  
		f.setVisible(true);  		
		
	}  
	public void windowClosing(WindowEvent e) 	  
	
	{  
		int a=JOptionPane.showConfirmDialog(f,"Are you sure, you want to quit?");  
		if(a==JOptionPane.YES_OPTION){  
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	}
	    
	}	
	public static void main(String[] args) 
	{  
		new OptionPaneExample();  
	}  
}  