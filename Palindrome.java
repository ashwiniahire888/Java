import java.util.Scanner;
class Palindrome 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int rev=0,temp=num,rem;
		while(temp != 0 )
		{
			rem =  temp % 10;
			rev = rev *10 + rem;
			temp = temp / 10;
		}
		if(num == rev)
		{
				System.out.println(num + " is a palindrome no");
		}
		else
		{
				System.out.println(num + " is not a palindrome no");
		}		
	}
}	