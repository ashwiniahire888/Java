import java.io.*;
import java.io.*;
class Ashu
{
    public static void main(String args[])throws IOException
    {
       
        int a,b;
        System.out.println("Enter two no.");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
       // c=Integer.parseInt(br.readLine());
       if(a>b) 
       {
           System.out.println("a is > b");
       }else
            System.out.println("b<a" );
    }
}