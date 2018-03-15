package hello;
import javax.jws.WebService;

@WebService
public interface ISayHelloService {
    public String sayHello(String name);
}
