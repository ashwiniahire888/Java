import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class SimpleCal extends Frame implements ActionListener
{
 JTextField T;
 JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
 JButton bplus,bsub,bmul,bdiv,bequ,bdot,bce,bon;
 int a,b,res;
 char opr;
 public SimpleCal()
 {
  JFrame F=new JFrame("Simple Calculater");
  F.setLayout(new FlowLayout());
  T=new JTextField(20);		F.add(T);
  JPanel P= new JPanel();
  P.setLayout(new GridLayout(4,4,5,5));
  b1=new JButton("1");		P.add(b1);
  b1.addActionListener(this);
  b2=new JButton("2");		P.add(b2);
  b2.addActionListener(this);
  b3=new JButton("3");		P.add(b3);
  b3.addActionListener(this);
  bplus=new JButton("+");		P.add(bplus);
  bplus.addActionListener(this);
  b4=new JButton("4");		P.add(b4);
  b4.addActionListener(this);
  b5=new JButton("5");		P.add(b5);
  b5.addActionListener(this);
  b6=new JButton("6");		P.add(b6);
  b6.addActionListener(this);
  bsub=new JButton("-");		P.add(bsub);
  bsub.addActionListener(this);
  b7=new JButton("7");		P.add(b7);
  b7.addActionListener(this);
  b8=new JButton("8");		P.add(b8);
  b8.addActionListener(this);
  b9=new JButton("9");		P.add(b9);
  b9.addActionListener(this);
  bmul=new JButton("*");		P.add(bmul);
  b1.addActionListener(this);
  b0=new JButton("0");		P.add(b0);
  b0.addActionListener(this);
  bdot=new JButton(".");		P.add(bdot);
  bdot.addActionListener(this);
  bequ=new JButton("=");		P.add(bequ);
  bequ.addActionListener(this);
  bdiv=new JButton("/");		P.add(bdiv);
  bdiv.addActionListener(this);
  F.add(P);
  bce=new JButton("CE");		F.add(bce);
  bce.addActionListener(this);
  bon=new JButton("ON");		F.add(bon);
  bon.addActionListener(this);
  F.setSize(400,400);
  F.setVisible(true);
  F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  public void actionPerformed(ActionEvent e)
  {
   if(e.getSource()==b1)
    T.setText("1");
   if(e.getSource()==b2)
    T.setText("2");
   if(e.getSource()==b3)
    T.setText("3");
   if(e.getSource()==b4)
    T.setText("4");
   if(e.getSource()==b5)
    T.setText("5");
   if(e.getSource()==b6)
    T.setText("6");
   if(e.getSource()==b7)
    T.setText("7");
   if(e.getSource()==b8)
    T.setText("8");
   if(e.getSource()==b9)
    T.setText("9");
   if(e.getSource()==bplus)
   {
    a=Integer.parseInt(T.getText());
    opr='+';
	T.setText("");
   }
   if(e.getSource()==bsub)
   {
    a=Integer.parseInt(T.getText());
    opr='-';
    T.setText("");
   }
   if(e.getSource()==bmul)
   {
    a=Integer.parseInt(T.getText());
    opr='*';
	T.setText("");
   }
   if(e.getSource()==bdiv)
   {
    a=Integer.parseInt(T.getText());
    opr='/';
	T.setText("");
   }
   if(e.getSource()==bequ)
   {
    b=Integer.parseInt(T.getText());
	switch(opr)
	{
	 case '+': res=a+b;break;
	 case '-': res=a-b;break;
	 case '*': res=a*b;break;
	 case '/': res=a/b;break;
	}
	T.setText(String.valueOf(res));
   }
   if(e.getSource()==bce)
   T.setText(" ");
   if(e.getSource()==bon)
   T.setText("0");
  }
  public static void main(String args[])
  {
   new SimpleCal();
  }
 }
 
	
