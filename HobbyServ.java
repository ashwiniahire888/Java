import javax.servlet.*;

import javax.servlet.http.*;

import java.io.*;
 

public class HobbyServ extends HttpServlet

{
 
 public void doPost(HttpServletRequest req,HttpServletResponse resp)
  throws ServletException,IOException
  
 {

        resp.setContentType("text/html");
   
     PrintWriter pw = resp.getWriter(); 
        String value[] = req.getParameterValues("Hobby");

      Cookie C[]= req.getCookies();

	pw.print("Existing cookies");

	if(C!=null)
 
        {
	
  for(int i=0;i<C.length;i++)
  
         {
     
        pw.print(C[i].getName() + C[i].getValue());
  
         }
  
       }


	Cookie A=new cookie("Hobby", hname);
	
if(C!=NULL)
        

	{
           
 for(int i=0;i<C.length;i++)
    
         {
    
             if(!(C[i].getValue().equals(hname))
  
                    resp.addcookie(A);
      
          else

                {

                 pw.print("Duplicate Hobby");
 
          return;

     }}
}

