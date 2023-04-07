import java.io.*;
import java.util.*;
class Rac
{
    static int fact(int n)
    {
        if(n==0 || n==1)
        return 1;
        else
        return(n*fact(n-1));

    }
    public static void main(String args[])throws   IOException
    {
        int i ,f=1;
        int num=4;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num=Integer.parseInt(br.readLine());
        f = fact(num);
        System.out.println("Factorial of "+num+ "is:"+f);
    }
}
   