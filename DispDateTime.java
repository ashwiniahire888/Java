import java.net.*;

import java.io.*;

class DispDateTime

{
 
public static void main(String args[])

 {

  Socket S=new Socket("time-A.timefreq.bldrdoc.gov",13);
  
InputStream is=S.getInputStream();

  System.out.println("Current date & time is");

  int ch;

  while((ch=is.read())!= -1)

  System.out.println((char)ch);
 
 is.close();

  S.close();

 }

}
