import javax.swing.*;    
public class ComboBoxEx extends JFrame{    
JFrame f;    
ComboBoxEx(){    
    f=new JFrame("ComboBox Example");    
    String country[]={"India","Aus","U.S.A","England","Newzealand"};        
    JComboBox cb=new JComboBox(country);    
    cb.setBounds(50, 50,90,20);    
    f.add(cb);        
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setLayout(null);    
    f.setSize(400,500);    
    f.setVisible(true);         
}    
public static void main(String[] args) {    
    new ComboBoxEx();         
}    
}   