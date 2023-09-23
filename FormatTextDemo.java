import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class FormatTextDemo extends Frame implements ItemListener
{
 JLabel l1,l2,l3;
 JTextField T;
 JCheckBox c1,c2,c3;
 JComboBox C1,C2;
 String font[] = {"Arial","Courier New","Georgia","Times New Roman","Cambria"};
 String tsize[]={"8","10","12","14","16","18","20"};
 Font Fn;  
public FormatTextDemo()
 {
  JFrame F=new JFrame();
  F.setLayout(new GridLayout(2,1,10,10));
  C1 = new JComboBox(font);
  C2 = new JComboBox(tsize);
  JPanel p=new JPanel();
  p.setLayout(new GridLayout(4,2,10,10));
  l1=new JLabel("Font");
  C1.addItemListener(this);
  l2=new JLabel("Size");
  C2.addItemListener(this);
  l3=new JLabel("Style");
  c1=new JCheckBox("Bold");
  c2=new JCheckBox("Italic");
  c3=new JCheckBox("Underline");
  c1.addItemListener(this);
  c2.addItemListener(this);                              
  c3.addItemListener(this);
  p.add(l1);
  p.add(l3);
  p.add(C1);
  p.add(c1);
  p.add(l2);
  p.add(c2);
  p.add(C2);
  p.add(c3);
  JPanel P=new JPanel();
  T=new JTextField(20);
  P.add(T);
  F.add(p);
  F.add(P);
  F.setSize(400,400);
  F.setVisible(true);
  F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  public void itemStateChanged(ItemEvent e)
  {
    //String text= T.getText();
     String fname;
     int size;	
       fname = (String)C1.getSelectedItem();
        size = Integer.parseInt((String)C2.getSelectedItem());
       
	if(c1.isSelected())
            
          Fn = new Font(fname,Font.BOLD,size);
         if(c2.isSelected())
            Fn = new Font(fname,Font.ITALIC,size);
         
          //if(c3.isSelected())
           // Fn = new Font(fname,Font.UNDERLINE,size);
         
	  T.setFont(Fn);
	  //T.setText(text);
	} 
	 
  
  public static void main(String args[])
  {
     new FormatTextDemo();
  }
  }
