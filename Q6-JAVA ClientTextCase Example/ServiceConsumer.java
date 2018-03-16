import java.net.*;
import java.io.*;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebServiceRef;
import com.dataaccess.webservicesserver.*;
	
public class ServiceConsumer {
		
		@WebServiceRef(wsdlLocation="http://www.dataaccess.com/webservicesserver/textcasing.wso?WSDL")
		static TextCasing service ;

    public static void main(String[] args) throws Exception {
		TextCasingSoapType soapService = service.getTextCasingSoap();
         System.out.println(soapService.invertStringCase("Mohamed"));

    }
}
