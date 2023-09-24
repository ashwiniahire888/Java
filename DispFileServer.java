import java.net.*;
import java.io.*;
class DispFileServer
{
 public static void main(String args[])throws IOException
 {
  ServerSocket SS=new ServerSocket(1111);
  System.out.println("Server started");
  Socket S=SS.accept();
  System.out.println("Waiting for client");
  InputStream is=S.getInputStream();
  DataInputStream dis=new DataInputStream(is);
  OutputStream os=S.getOutputStream();
  DataOutputStream dos=new DataOutputStream(os);
  String msg;
  String fname=dis.readUTF();
  File F=new File(fname);
  if(F.exists())
  {
   FileInputStream fis=new FileInputStream(F); 
   int ch;
   while((ch=fis.read())!= -1)
   {
    msg+=(char)ch;
   }
   dos.writeUTF(msg);
  }
  else
  dos.writeUTF("0");
 }
}

