import java.util.*;
import java.io.*;
class Armstrong1
{
	//public static void main(String args[])
	public static void main(String args[]) throws IOException
	{
		int n, rem, amo=0;
		
		//Scanner s = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" Enter Number = ");
		//n=s.nextInt();
        n=Integer.parseInt(br.readLine());
		int temp = n;
		while (n>0)
		{
			rem = n%10;
			amo = amo + (rem * rem * rem);
			n = n/10;
		}
		
		if ( temp != amo)
			System.out.println(temp +"  is Armstrong  = "+ amo);
		else
			System.out.println(temp + " is Not Armstrong Number = "+ amo);
	}		
}