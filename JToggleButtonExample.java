import java.awt.FlowLayout;  
import java.awt.event.ItemEvent;  
import java.awt.event.ItemListener;  
import javax.swing.JFrame;  
import javax.swing.JToggleButton;  
import javax.swing.*;  
import java.awt.*;  
import javax.swing.*; 
public class JToggleButtonExample extends JFrame implements ItemListener {  
    public static void main(String[] args) {  
        new JToggleButtonExample();  
		new TabbedPaneExample();
    }
  
    private JToggleButton button;  
    JToggleButtonExample() {  
        setTitle("JToggleButton");  
        setLayout(new FlowLayout());  
        setJToggleButton();  
        setAction();  
        setSize(500, 300);  
        setVisible(true);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }  
    private void setJToggleButton() {  
        button = new JToggleButton("ON");  
        add(button);  
    }  
    private void setAction() {  
        button.addItemListener(this);  
    }  
    public void itemStateChanged(ItemEvent eve) {  
        if (button.isSelected())  
            button.setText("OFF");  
        else  
            button.setText("ON");  
    }  
}  
	class TabbedPaneExample{  
	JFrame f; 
	TabbedPaneExample(){  
    f=new JFrame();  
    JTextArea ta=new JTextArea(200,200);  
    JPanel p1=new JPanel();  
    p1.add(ta);  
	JButton b2=new JButton("Button 2");   
    b2.setBounds(100,100,80,30);    
    b2.setBackground(Color.green);   
	
    JPanel p2=new JPanel();
	p2.add(b2);
    JPanel p3=new JPanel();  
    JTabbedPane tp=new JTabbedPane();  
    tp.setBounds(50,50,200,200);  
    tp.add("main",p1);  
    tp.add("visit",p2);  
    tp.add("help",p3);    
    f.add(tp);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);  
}

	}