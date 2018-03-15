package hello;
import javax.jws.WebService;

@WebService(endpointInterface = "hello.ISayHelloService")
public class SayHelloService implements ISayHelloService{
	
	@Override
    public String sayHello(String name) {
        return "Bonjour "+name+" !";
    }
    
}
