import java.io.*;
class Array11
{ 
    public static void main(String args[])throws Exception
    {
        int n =Integer.parseInt(args[0]);
        int array [] = new int [n];
        System.out.println("Enter"+n+ "elements");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<n;i++)
        array[i] = Integer.parseInt(br.readLine());
        System.out.print("Array elements are:");
        for(i=0;i<n;i++)
        System.out.print(array[i] + "\t");
    }
}