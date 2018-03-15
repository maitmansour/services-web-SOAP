import java.net.*;
import java.io.*;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import hello.*;

public class ServiceConsumer {
    public static void main(String[] args) throws Exception {

		SayHelloServiceService service = new SayHelloServiceService();
		ISayHelloService hello = service.getSayHelloServicePort();
         System.out.println(hello.sayHello("Mohamed"));

    }
}
