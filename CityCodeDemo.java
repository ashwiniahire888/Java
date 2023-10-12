import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class CityCodeDemo extends Frame implements ActionListener
{
 JLabel l1,l2,l3;
 JTextField t1,t2,t3,t4;
 JTextArea T1=new JTextArea(4,3);
 Hashtable ht=new Hashtable();
 BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
 String cname, code;
 CityCodeDemo()
{
 JFrame F= new JFrame();
  F.setLayout(new FlowLayout());
  JPanel P1=new JPanel();
  P1.add(T1);
  JPanel P2=new JPanel();
  P2.setLayout(new FlowLayout());
  t1=new JTextField();
  t2=new JTextField();
  P2.add(t1); P2.add(t2);
  F.add(P1); F.add(P2);
  F.setSize(300,300);
   F.setVisible(true);
   F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
  public void actionPerformed(ActionEvent e)
       {
                String msg=e.getActionCommand();
                if(msg.equals("Add"))
                {
                	cname=t1.getText();
                	code=t2.getText();
                	ht.puts(cname,code);
                	T1.append(cname+" "+code);
                }
                if(msg.equals("Remove"))
                {
                	name=t3.getText();
                	Enumeration Keys=ht.keys();
              		while(Keys.hasMoreElements())
              		{
              			cname=Keys.nextElement();
              			if(name.equals(cname))
              			{	ht.remove(cname);
              				break;
              			}
              		}
              		System.out.println(cname+"not found");
                }
                if(msg.equals("Search"))
                {
                	name=t4.getText();
                	Enumeration Keys=ht.keys();
              		while(Keys.hasMoreElements())
              		{
              			cname=Keys.nextElement();
              			if(name.equals(cname))
              			{	
              				Enumeration values=ht.elements(cname);
              				t1.setText(cname);
              				t2.setText(code);
              			}
              		}
              		System.out.println(cname+"not found");
                }
       }
}
                              
