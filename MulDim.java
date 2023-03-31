import java.io.*;
class MulDim 
{
 public static void main(String args[])throws Exception
 {
     int array [] [] = new int[3][3];
     System.out.println("Enter array elements");
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     for(int i=0;i<3;i++)
     for(int j=0;j<3;j++)
     array[i][j] = Integer.parseInt(br.readLine());
     System.out.println("Array elements are:");
     for( int i=0;i<3;i++)
     {
         for( int j=0;j<3;j++)
     {
     System.out.println(array[i][j] +"\t");
 }
 System.out.println(" ");
}   
 }
}
    

