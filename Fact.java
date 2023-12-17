import java.io.*;

class Fact
{
    public static void main(String args[])throws IOException
    {
        int a,i=1,fact=1,n=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a=Integer.parseInt(br.readLine());
        while(i<=n)
        {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of given number="+fact);
    }
}