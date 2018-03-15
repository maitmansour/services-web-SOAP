package sender;

import java.net.*;
import java.io.*;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import hello.ISayHelloService;

import javax.naming.*;
import javax.jms.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Sender extends HttpServlet {
  public void doPost(HttpServletRequest request,  HttpServletResponse response)   throws ServletException, IOException {
  	 String fname=request.getParameter("firstname");   	 
  	 String message=request.getParameter("message"); 
    PrintWriter out = response.getWriter();
    
    
		try{
		URL url = new URL("http://e-mc137-123:8080/q1/SayHelloServiceService?WSDL");
        QName qname = new QName("http://hello/", "SayHelloServiceService");

        Service service = Service.create(url, qname);

        ISayHelloService hello = service.getPort(ISayHelloService.class);

         out.println(hello.sayHello(fname));
         

	} catch(Exception e){
		System.out.println(e.getMessage());
	}
        
    
  }
}
