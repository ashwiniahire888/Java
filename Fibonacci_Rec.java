import java.util.*;
import java.io.*;
class Fibonacci_Rec
	{  
        static int f=0,f1=1,f2=0; 
	 
	 static void printFibonacci(int count)
	 {    
		if(count>0)
		{
            System.out.print(" "+f2); 		
			 f2 = f + f1;    
			 f = f1;    
			 f1 = f2;    
			   
			 printFibonacci(count-1);    
		 }    
	 }
	 
	 public static void main(String args[])throws IOException
	 {    
	  int count; 
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter Number");
      count=Integer.parseInt(br.readLine()); 
	  printFibonacci(count);  
	 }  
	}