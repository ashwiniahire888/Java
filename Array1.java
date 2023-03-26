import java.io.*;
class Array1
{ 
    public static void main(String args[])throws Exception
    {
        int n =Integer.parseInt(args[0]);
        int array[] = new int [n];
        System.out.println("Enter"+n+ "elements");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<n;i++)
        array[i] = Integer.parseInt(br.readLine());
        System.out.print("Array elements are:");
        int sum=0;
        for( int i=0;i<n;i++)
        sum = sum + array[i];
        //System.out.print(array[i] + "\t");
        System.out.print("sum =" + sum);

    }
}