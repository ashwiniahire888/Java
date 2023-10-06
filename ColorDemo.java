import java.util.*;

import java.io.*;

class ColorDemo

{

  public static void main(String args[])throws IOException
   
{

     LinkedList l=new LinkedList();
   
  l.add("red");

     l.add("blue");
 
    l.add("yellow");
   
  l.add("orange");
   
 Iterator i=l.iterator();

    System.out.println("original content");
 
   while(i.hasNext())

     System.out.println((String)i.next());
 
   ListIterator li=l.listIterator();

    System.out.println("revers content");

     while(li.hasPrevious())

     System.out.println((String)li.previous());

     LinkedList ll=new LinkedList();
  
   ll.add("pink");
  
   ll.add("green");
   
  l.add(2,ll);
    
 System.out.println("after inserting new elements the l becomes"+l);
  
   }

}
