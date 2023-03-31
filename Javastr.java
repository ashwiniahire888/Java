import java.io.*;
import java.util.*;
class Javastr
{
    public static void main(String args[])
    {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Given string:");
        str=br.readLine();
        {
            for(String Returnval:str.split(" ")){
            
            System.out.println(Returnval);
        }

    }
}
}