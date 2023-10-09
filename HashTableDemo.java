import java.io.*;
import java.util.*;
class HashTableDemo
{
 public static void main(String args[])throws IOException
{
 Hashtable ht=new Hashtable();
 int i,n;
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 String name;
 double per;
 String sname;
 double max;
 System.out.println("how many students?");
 n=Integer.parseInt(br.readLine());
 for(i=1;i<=n;i++)
 {
  System.out.println("enter name and per");
  name=br.readLine();
  per=Double.parseDouble(br.readLine());
  ht.put(name,per);
  }
 Enumeration key=ht.keys();
 System.out.println("list of names");
 while(key.hasMoreElements())
 System.out.println((String)key.nextElement());
 Enumeration value=ht.elements();
 System.out.println("corresponding per");
 while(value.hasMoreElements())
 System.out.println((String)value.nextElement());
if(per > max)
{
max=per;
sname=name;
}
System.out.println("student having maximum per");
System.out.println("name"+sname);
System.out.println("per"+max);
}
}
