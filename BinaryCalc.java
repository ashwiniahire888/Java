import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class BinaryCalc extends Frame implements ActionListener
 {
    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3,t4;
    JButton b1,b2;
    BinaryCalc()
    {
    	JFrame F=new JFrame("Conversion");
    	F.setLayout(new GridLayout(5,2));
     	l1=new JLabel("Decimal");
     	F.add(l1);
     	t1=new JTextField();
     	F.add(t1);
     	l2=new JLabel("Binary");
     	F.add(l2);
     	t2=new JTextField();
     	F.add(t2);
     	l3=new JLabel("Octal");
     	F.add(l3);
     	t3=new JTextField();
     	F.add(t3);
     	l4=new JLabel("Hexadecimal");
     	F.add(l4);
     	t4=new JTextField();
     	F.add(t4);
        b1 = new JButton("Calculate");
        F.add(b1);
        b2 = new JButton("Exit");
        F.add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        F.setSize(400,400);
        F.setVisible(true);
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   public void actionPerformed(ActionEvent e)
   {
   	 String msg = e.getActionCommand();
   	 int n,i,j;
   	 int a[]=new int[50];
   	 int b[]=new int[50];
   	 int c[]=new int[50];
   	 if(msg.equals("Calculate"))
   	 {
   	 	n=Integer.parseInt(t1.getText());
   	 	int num=n;
   	 	//decimal to binary
   	 	i=0;
   	 	while(n>0)
   	 	{
   	 		a[i]=n%2;
   	 		n/=2;
   	 		i++;
   	 	}
   	 	StringBuffer s1= new StringBuffer(10);
   	 	for(j=i-1;j>=0;j--)
   	 	s1.append(String.valueOf(a[j]));
   	 	t2.setText(String.valueOf(s1));
   	    i=0;
   	    n=num;
   	    while(n>0)
   	    {
   	    	b[i]=n%8;
   	    	n/=8;
   	    	i++;
   	    }
   	    StringBuffer s2=new StringBuffer(10);
   	    for(j=i-1;j>=0;j--)
   	    s2.append(String.valueOf(b[j]));
   	 	t3.setText(String.valueOf(s2));
   	 	i=0;
   	    n=num;
   	    while(n>0)
   	    {
   	    	b[i]=n%16;
   	    	n/=16;
   	    	i++;
   	    }
   	    StringBuffer S3=new StringBuffer(10);
   	    for(j=i-1;j>=0;j--)
   	    {
   	    	switch(c[j])
   	    	{
   	    		case 10: S3.append("A");
   	    				 break;
   	    		case 11: S3.append("B");
   	    				 break;
   	    		case 12: S3.append("C");
   	    				 break;
   	    		case 13: S3.append("D");
   	    				 break;
   	    		case 14: S3.append("E");
   	    				 break;
   	    		case 15: S3.append("F");
   	    				 break;
   	    		default: S3.append(String.valueOf(a[j]));
   	    	}
   	    }
   	    t4.setText(String.valueOf(S3));
   	 }
   	 if(msg.equals("Exit"))
   	 	System.exit(0);
   }
   public static void main(String args[])
    {
      new BinaryCalc();
    }
}                                                                                