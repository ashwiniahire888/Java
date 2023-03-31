import java.io.*;
import java.util.*;
class Large
{
	public static void main(String args[ ])throws Exception
  {
 	    int a,b;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter 2no");
    	a=Integer.parseInt(br.readLine());
	b=Integer.parseInt(br.readLine());
	//c=Integer.parseInt(br.readLine());
	
                  if(a>b)
	{
	System.out.println("a is greater");
	}
	
   	else
	{
	System.out.println("b is greater");
	}
}
}