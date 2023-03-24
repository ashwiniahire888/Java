import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Apattern{
    public static void main(String args[])
    {
        System.out.println("Enter Name");
        Scanner s = new Scanner(System.in);
        String str = s.next();
        //s.close();
        //String regex = "[A-Z]";
        Pattern p = Pattern.compile("[^A-Z]");
        Matcher m = p.matcher(str);
        if(str.matches(m))
        {
            System.out.println("Input  accepted");
        }
        else
        {
            System.out.println("Error");
        }
    }
}