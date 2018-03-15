import java.net.*;
import java.io.*;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import hello.ISayHelloService;

public class ServiceConsumer {
    public static void main(String[] args) throws Exception {

        URL url = new URL("http://e-mc137-123:8080/q1/SayHelloServiceService?WSDL");
        QName qname = new QName("http://hello/", "SayHelloServiceService");

        Service service = Service.create(url, qname);

        ISayHelloService hello = service.getPort(ISayHelloService.class);

         System.out.println(hello.sayHello("Mohamed"));

    }
}
