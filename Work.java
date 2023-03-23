import java.io.*;
import java.util.*;
class Work
{
       static int numberOfDays(int a,int b,int n)
    {
        int Days=b*(n+a)/(a+b);
    return Days;
    
    }
    public static void main(String args[])
    {
        int a,b,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter A");
        a=sc.nextInt();
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter B");
        b=sc1.nextInt();
        Scanner sc2=new Scanner(System.in);
        System.out.println("Enter  the number n");
        n=sc2.nextInt();
        System.out.println();
        System.out.println(numberOfDays(a,b,n));
    }
}

    