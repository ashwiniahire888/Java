import java.io.*;
import java.util.*;
class Reverse
{
    public static void main(String args[])throws Exception
    {
        int a ,rem,rev=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a=Integer.parseInt(br.readLine());
       
        while(a>0)
        
{
    rem=a%10;
    rev=rev *10 + rem;
    a=a/10;

}   
System.out.println("Reverse of given no=" +rev); }
}