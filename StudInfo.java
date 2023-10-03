import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class StudInfo extends Frame implements ItemListener

{

 int i;
 JLabel l1,l2,l3;
 JTextField T1,T2;

 JCheckBox C[]= new JCheckBox[3];
 
JRadioButton R[]=new JRadioButton[3];

 ButtonGroup bgrp;

 public StudInfo()

 {
  
JFrame F= new JFrame();

  F.setLayout(new FlowLayout());
 
 JPanel P1=new JPanel();

  P1.setLayout(new GridLayout(1,2,10,10));

   l1=new JLabel("Your Name :");
  
 T1=new JTextField(30); 
  
  P1.add(l1);
  
  P1.add(T1);
  
JPanel P2=new JPanel();
 
 P2.setLayout(new GridLayout(4,1,10,10));
 
  l2= new JLabel("Your Class");
  
  P2.add(l2);
   
 R[0]=new JRadioButton("fy");
  
  R[1]=new JRadioButton("sy");
  
  R[2]=new JRadioButton("ty");
  
  bgrp = new ButtonGroup(); 
   
  for(int i=0;i<3;i++)
  
      {
   
          R[i].addItemListener(this);
       
      P2.add(R[i]);
        
     bgrp.add(R[i]);
    
    }
 
 JPanel P3=new JPanel();
 
 P3.setLayout(new GridLayout(4,1,10,10));

   l3=new JLabel("Your Hobbies");
 
  P3.add(l3);
 
  C[0]=new JCheckBox("Music");

   C[1]=new JCheckBox("Dance");

   C[2]=new JCheckBox("Sports");

   for(int i=0;i<3;i++)
        
{

             C[i].addItemListener(this);

             P3.add(C[i]);
        
}

   T2=new JTextField(50);

   F.add(P1);
  
 F.add(P2);

   F.add(P3);

   F.add(T2);
   
F.setSize(300,300);
   
F.setVisible(true);

   F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }
  
public void itemStateChanged(ItemEvent e)

 { 
  
String S1="Name: ";

  String S2="Class ";

  String msg,S3="Hobbies ";

  S1 += T1.getText();  

for(i=0;i<3;i++)

  {
   
 
   if(R[i].isSelected())
     
 S2 +=R[i].getText();
   
    if(C[i].isSelected())

     {
       
S3+=C[i].getText();
  
     S3+="   ";
  
   }
   
 }/*
    if(c2.isSelected())
      S3+=c2.getText();
  
    if(c3.isSelected())
      S3+=c3.getText();*/ 
 
  msg = S1+"  "+S2+"  "+S3;  
 
   T2.setText(msg);
 
 
}

public static void main(String args[])

{
 
new StudInfo();

}

}
