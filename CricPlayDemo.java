import java.io.*;

class DivisionByZeroException extends Exception

{
}

class CricketPlayer

{

 String name;
 
int inni,n_o,tot_run;

 double avg;

 CricketPlayer(String name,int i,int no,int run, double a)

 {

  this.name=name;
  
inni=i;
 
 n_o=no;

  tot_run=run;
 
 avg=a;

 }

 public String toString()

 {

  return(name+"\t"+inni+"\t"+n_o+"\t"+tot_run+"\t"+avg);

 }

}

class CricPlayDemo

{

 public static double avg(int inn,int runs,int no)

 {

  try
 
 {

   if((inn-no)==0) 

    throw new DivisionByZeroException();

  }

  catch(DivisionByZeroException e1)

  {

   System.out.println("Division By Zero");

  }
  return(runs/(inn-no));

 }

 public static void sortPlayer(CricketPlayer CP[],int n)

 {

   for(int i=1;i<n;i++)


  {
 
     for(int j=0;j<n-i;j++)
 
    {
   
   if(CP[i].avg<CP[j+1].avg)

      { 

 	CricketPlayer temp=CP[j];
	
CP[j]=CP[j+1];
	CP[j+1]=temp;

      }

     }

   }
 
}

 public static void main(String args[]) throws IOException

 {
  String name;

  int inni,n_o,tot_run,n,i;

  double a;

  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

  CricketPlayer CP[]=new CricketPlayer[20];
  
System.out.println("How many Players?");

  n=Integer.parseInt(br.readLine());
    
for(i=0;i<n;i++)
  
{

   System.out.println("Enter name,innings,not out, total runs");

   name=br.readLine();

   inni=Integer.parseInt(br.readLine());

   n_o=Integer.parseInt(br.readLine());

   tot_run=Integer.parseInt(br.readLine());

   a= avg(inni,tot_run,n_o);
  
 CP[i]=new CricketPlayer(name,inni,n_o,tot_run,a);

  } 

  sortPlayer(CP,n);

  for(i=0;i<n;i++)

  System.out.println(CP[i]);

 }

}

