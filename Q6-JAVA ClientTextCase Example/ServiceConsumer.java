import java.net.*;
import java.io.*;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebServiceRef;
import com.dataaccess.webservicesserver.*;
public class ServiceConsumer {
	
	@WebServiceRef(wsdlLocation="https://www.dataaccess.com/webservicesserver/textcasing.wso?WSDL")
    public static void main(String[] args) throws Exception {

        URL url = new URL("https://www.dataaccess.com/webservicesserver/textcasing.wso?WSDL");
        QName qname = new QName("http://www.dataaccess.com/webservicesserver/", "textcasing");

        Service service = Service.create(url, qname);
		
        InvertStringCase hello = service.getPort(TextCasing.class);

         System.out.println(hello.InvertStringCase("Mohamed"));

    }
}
