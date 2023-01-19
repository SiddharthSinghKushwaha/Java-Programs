import javax.swing.*;    
import java.awt.event.*;  
public class PasswordBased extends JFrame implements ActionListener
{  

	JFrame f;
	 JLabel l1, l2;
	final JLabel label;
	JButton b;
	final JTextField text;
		PasswordBased(){
		
		f=new JFrame("Password Field Example");		
		label = new JLabel();
		label.setBounds(20,150, 200,50);  
		
		final JPasswordField value = new JPasswordField();   
		value.setBounds(100,75,100,30);   
		
	    l1=new JLabel("Username:"); 
        l1.setBounds(20,20, 80,30);    
		
        l2=new JLabel("Password:");    
        l2.setBounds(20,75, 80,30);    
		
        b = new JButton("Login");  
        b.setBounds(100,120, 80,30);    
		b.addActionListener(this);
		
        text = new JTextField();  
        text.setBounds(100,20, 100,30);    
		
        f.add(value); f.add(l1); f.add(label); f.add(l2); f.add(b); f.add(text);  
        
        f.setSize(500,500);    
        f.setLayout(null);    
        f.setVisible(true);     
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
		public void actionPerformed(ActionEvent e)
		{
			String data = "Username " + text.getText();   
                   label.setText(data);   
		}
    public static void main(String[] args)
	{    
		new PasswordBased();
		new CheckBoxExample();
	}   
}

/*
class CheckBoxExample extends JFrame implements ActionListener{  
    JLabel l;  
    JCheckBox cb1,cb2,cb3;  
    JButton b;  
    CheckBoxExample(){  
        l=new JLabel("Food Ordering System");  
        l.setBounds(50,50,300,20);  
        cb1=new JCheckBox("Pizza @ 100");  
        cb1.setBounds(100,100,150,20);  
        cb2=new JCheckBox("Burger @ 30");  
        cb2.setBounds(100,150,150,20);  
        cb3=new JCheckBox("Tea @ 10");  
        cb3.setBounds(100,200,150,20);  
        b=new JButton("Order");  
        b.setBounds(100,250,80,30);  
        b.addActionListener(this);  
        add(l);add(cb1);add(cb2);add(cb3);add(b);  
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }  
    public void actionPerformed(ActionEvent e){  
        float amount=0;  
        String msg="";  
        if(cb1.isSelected()){  
            amount+=100;  
            msg="Pizza: 100\n";  
        }  
        if(cb2.isSelected()){  
            amount+=30;  
            msg+="Burger: 30\n";  
        }  
        if(cb3.isSelected()){  
            amount+=10;  
            msg+="Tea: 10\n";  
        }  
        msg+="-----------------\n";  
        JOptionPane.showMessageDialog(this,msg+"Total: "+amount);  
    }  
}    */
