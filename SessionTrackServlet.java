import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

 public class SessionTrackServ extends HttpServlet
 {
  public void doPost(HttpServletRequest req, HttpServletResponse resp)throws IOException,ServletException
  {
   resp.SetContentType=("text/html");
   PrintWriter pw=resp.getWriter();
   String msg;
   Integer count;
   HttpSession hs=req.getSession(true);
   count=hs.getAttribute("AccessCount");
   if(count==null)
   {
    msg="Welcome Newcomer";
    count=Integer(0);
   }
   else
   {
    msg="Welcome Back";
    count=Integer(count.intValue()+1);
   }
  hs.SetAttribute("AccessCount",count);
  pw.print("<HTML><BODY>");
  pw.print("<H1>"+msg+"</H1>");
  pw.print("<H2>No. of previous visits:"+count+"</H2>");
  pw.print("</BODY><HTML>");
 }
}

