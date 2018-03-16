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
		TextCasing service = new TextCasing();
		TextCasingSoapType soapService = service.getTextCasingSoap();
         System.out.println(soapService.invertStringCase("Mohamed"));

    }
}
