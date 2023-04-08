import java.util.*;
import java.io.*;
class String_Rev
{
	public static void main(String args[]) throws IOException
	{
		//Scanner s = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" Enter String  =");
		String a = br.readLine();
		String rev ="";
		for(int i = a.length()-1;i>=0;i--)
		{
			rev +=a.charAt(i);
		}
		System.out.println(" String is Reverse = "+ rev); 
			
	}
}