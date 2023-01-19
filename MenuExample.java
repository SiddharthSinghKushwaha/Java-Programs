import javax.swing.*;    
import java.awt.event.*;    
public class MenuExample implements ActionListener
{    
	JFrame f;    
	JMenuBar mb;    
	JMenu file,edit,help;    
	JMenuItem cut,copy,paste,selectAll;    
	JTextArea ta;  
	JLabel l1,l2;	
	MenuExample(){    
	f=new JFrame();
	f.setTitle("Menu Example");
	//Image img = new ImageIcon("bullet.png").getImage();
	//setIconImage(img);
	cut=new JMenuItem("cut");    
	copy=new JMenuItem("copy");    
	paste=new JMenuItem("paste");    
	selectAll=new JMenuItem("selectAll");    
	cut.addActionListener(this);    
	copy.addActionListener(this);    
	paste.addActionListener(this);    
	selectAll.addActionListener(this);    
	mb=new JMenuBar();    
	file=new JMenu("File");    
	edit=new JMenu("Edit");    
	help=new JMenu("Help");   
	//example of separator  
//addSeparator(); create a divides line 	
	edit.add(cut);edit.addSeparator();edit.add(copy);
	edit.addSeparator();edit.add(paste);edit.addSeparator();edit.add(selectAll);    
	mb.add(file);mb.add(edit);mb.add(help);    
	ta=new JTextArea();    
	ta.setBounds(5,100,360,320);    
	f.add(mb);f.add(ta);    
	f.setJMenuBar(mb);  
	f.setLayout(null);    
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	f.setLocationByPlatform(true);
	f.setSize(400,400);    
	f.setVisible(true);    
}     
	public void actionPerformed(ActionEvent e) 
	{    
		if(e.getSource()==cut)    
		ta.cut();    
		if(e.getSource()==paste)    
		ta.paste();    
		if(e.getSource()==copy)    
		ta.copy();    
		if(e.getSource()==selectAll)    
		ta.selectAll();    
	}     
	public static void main(String[] args) 
	{    
		new MenuExample();    
	}    
}    