

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
 
 msg=dis.readUTF();
 
 dos.writeUTF(msg.toUpperCase());
  
if(msg.equals("end")||msg.equals("END"))
 
 break;
  
}

  dis.close();
 
 dos.close();

  S.close();
 
}

} 
