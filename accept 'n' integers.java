import java.util.*;
import java.io.*;

class cola1
{
  public static void main(String[] args) throws Exception
  {
   int num,ele,i;
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   ArrayList al=new ArrayList();
   System.out.println("Enter the no for how many element to have:");
   num=Integer.parseInt(br.readLine());
   for(i=0;i<num;i++)
   {
     System.out.println("Enter the elements in position:"+i);
     ele=Integer.parseInt(br.readLine());
    al.add(ele);
   }
 
     System.out.println("The elements of ArrayList before:"+al);
     Collections.sort(al);
     System.out.println("The elements of ArrayList after sort:"+al);
}
}