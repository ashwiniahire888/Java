import java.net.*;

import java.io.*;

class DispFileClient

{
 public static void main(String args[])throws IOException

 {

  Socket S=new Socket("localhost",1111);
 
 InputStream is=S.getInputStream();

  DataInputStream dis=new DataInputStream(is);
  OutputStream os=S.getOutputStream();
  DataOutputStream dos=new DataOutputStream(os);
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter file name");
  String fname=br.readLine();
  dos.writeUTF(fname);
  String msg=dis.readUTF();
  if(msg.equals("0"))
  System.out.println("File doesn't exist");
  else
  {
   System.out.println("File Contents....");
   System.out.println(msg);
  }
 }
} 
