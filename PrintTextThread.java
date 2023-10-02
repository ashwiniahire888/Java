 import java.io.*;

 class PrintTextThread extends Thread

 {

  String msg;
 
 int n;
  
PrintTextThread(String msg,int n)
 
  {

   this.msg=msg;
 
  this.n=n;

  }

  public void run()
 
 {
 
  for(inti=1;i<=n;i++)

   {
   
	System.out.println(msg);

     try
 
   {
 
    Thread.sleep(1000);

    }
   
 catch(InterruptedException e)
  
  { 
}
 

  }

  }

 }

 class PrintTextThread
  
{

   public static void main(String args[])

   {

    PrintTextThread T1=new PrintTextThread("I am in fy",10);

    PrintTextThread T2=new PrintTextThread("I am in sy",20);
   
 PrintTextThread T2=new PrintTextThread("I am in sy",20);
        
  T1.start();

          T2.start();
  
        T3.start();
  
  
  }
 
}

    
    
