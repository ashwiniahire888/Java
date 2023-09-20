import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
public class NumOpr extends Frame implements ActionListener
{
	JMenuBar mbar;
	JMenu m1,m2;
	JTextField T1;
	JMenuItem load,save,sum,avg,asc,desc;
public NumOpr()
{
	JFrame f=new JFrame();
	mbar=new JMenuBar();
	m1=new JMenu("file");
	  mbar.add(m1);
	m2=new JMenu("operation");
	  mbar.add(m2);
	load=new JMenuItem("load");
	     m1.add(load);
	load.addActionListener(this);
	save=new JMenuItem("save");
	     m1.add(save);
	save.addActionListener(this);
	sum=new JMenuItem("sum");
	     m2.add(sum);
	sum.addActionListener(this);
	avg=new JMenuItem("average");
	    m2.add(avg);
	avg.addActionListener(this);
	asc=new JMenuItem("asc");
	    m2.add(asc);
	asc.addActionListener(this);
	desc=new JMenuItem("desc");
	     m2.add(desc);
	desc.addActionListener(this);
	           
	           f.setJMenuBar(mbar);
	           T1=new JTextField();
	              f.add(T1);
	           f.setSize(300,300);
	           f.setVisible(true);
	           f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	                                                  
}	

public void actionPerformed(ActionEvent e)
{ int i,n,x;
int add=0;
  int a[]=new int [10];
	String msg=e.getActionCommand();
	   if(msg.equals("laod"))
	   {
	   	Random R=new Random();
	   	for(i=0;i<10;i++)
	   	{
	   		n=R.nextInt()%100;
	   		 if(n>=10)
	   		  a[i]=n;
	   		 	
	   	}
	 for(i=0;i<10;i++)
	  T1.setText(String.valueOf(a[i]+""));
	   }
	   if(msg.equals("save"))
	 {
	 	FileOutputStream fos=new FileOutputStream();
	 	DataInputStream dos=new DataOutputStream();	
	 	for(i=0;i<n;i++)
	 	 x=a[i];
	 	dos.writeInt(x);
	 			
	 }	
	 	if(msg.equals("sum"))
	 	{
	 		for(i=0;i<10;i++)
	 		 add+=a[i];
	 		
	 	T1.setText("sum is"+String.valueOf(sum));		
	 	}
	 	if(msg.equals("average"))
	 	{
	 	double	avg=add/10;
	 	T1.setText("Average is"+String.valueOf(avg));
	 	  	
	 	}
	 	if(msg.equals("Ascending"))
	 	{
	 		for(i=1;i<10;i++)
	 		{
	 			for(int j=0;j<10-i;j++)
	 			{
	 				if(a[j]>a[j+1])
	 				{
	 					int temp=a[j];
	 					a[j]=a[j+1];
	 					a[j+1]=temp;
	 				}	
	 			}	
	 		}	
	 			for(i=0;i<10;i++)
	 			T1.setText(String.valueOf(asc));
	 				
	 	}		
	 }
	 public static void main(String args[])
	 {
	 	new NumOpr();
	 }    }
    