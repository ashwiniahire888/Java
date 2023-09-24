import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

import java.applet.*;

/*
<applet code="MouseEventDemo" width=300 height=300>
</applet>
*/

public class MouseEventDemo extends Applet implements MouseListener,MouseMotionListener

{ 
    
 int x,y;
   
  String msg; 

     public void init()
 
    {
     
   addMouseListener(this);
  
      addMouseMotionListener(this);
  
   } 
 
    public void mouseClicked(MouseEvent e)
 
    {
      
 x = e.getX();
  
     y = e.getY();
  
     msg = "Mouse clicked "+x+" , "+y;
  
     repaint();
 
    }

   
  public void mousePressed(MouseEvent e)
  
   {
 
      x = e.getX();
  
     y = e.getY();
  
     msg = "Mouce presseed "+x+" , "+y;
  
     repaint();
 
    }
 
    public void mouseReleased(MouseEvent e)
  
   {
     
  x = e.getX();
 
      y = e.getY();
   
    msg = "Mouce released "+x+" , "+y;
  
     repaint();
   
  }
 
    public void mouseEntered(MouseEvent e)
 
    {
    
   x = e.getX();
  
     y = e.getY();
    
   msg = "Mouce entered "+x+" , "+y;
  
     repaint();
   
  }
 
    public void mouseExited(MouseEvent e)
   
  {
     
  x = e.getX();
   
    y = e.getY();
    
   msg = "Mouse exited "+x+" , "+y;
  
     repaint();
  
   }
    
 public void mouseMoved(MouseEvent e)
   
  {
    
   x = e.getX();
 
      y = e.getY();
  
     msg = "Mouse moved "+x+" , "+y;
  
     repaint();
    
 }
  
   public void mouseDragged(MouseEvent e)
 
    {
  
     x = e.getX();
 
      y = e.getY();
     
  msg = "Mouse Dragged "+x+" , "+y;
      
 repaint();
  
   }

   
  public void paint(Graphics g)
    
 {
       
  g.drawString(msg,10,10);
     
}


}
