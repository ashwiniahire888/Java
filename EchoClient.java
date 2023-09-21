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
  String msg;
  System.out.println("Enter message & enter END to stop");
  while(true)
  {
   msg=br.readLine();
   dos.writeUTF(msg);
   if(msg.equals("END"))
   break;
  }
 }
}
