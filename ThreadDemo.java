/**
 Write  a  program  to  calculate  the  sum  and  average  of  an  array  of  1000  integers
(generated randomly) using 10 threads. Each thread calculates the sum of 100 integers.
Use these values to calculate average. [Use join method]
 */

import java.io.*;
import java.util.*;
class ThreadDemo extends Thread
{
	int arr[];
	int sum=0, pos;
	public ThreadDemo(int p, int a[])
	{
		arr=a;
		pos=p;
    }
    public void run()
    {
    	for(int i=pos;i<pos+100;i++)
    		sum+=arr[i];
    }
    int getSum()
    {
    	return sum;
    }

public static void main (String[] args) throws InterruptedException 
	{
		Random rand=new Random();
		int sum=0,i;
		int no[]=new int[1000];
		for(i=0;i<1000;i++)
		{
			no[i]=rand.nextInt(1000);
		}
    ThreadDemo t[]=new ThreadDemo[10];
    for(i=0;i<10;i++)
    {
    	t[i]=new ThreadDemo(i,no);
    	t[i].start();
    	t[i].join();   	
    }
    for(i=0;i<10;i++)
    	sum+=t[i].getSum();
    System.out.println("Sum is :"+ sum);
    }
}