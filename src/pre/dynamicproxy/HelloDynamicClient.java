package pre.dynamicproxy;
import java.lang.reflect.Proxy;
 
public class HelloDynamicClient {
    public void ex() {
        Hello proxiedHello = (Hello)Proxy.newProxyInstance(
                getClass().getClassLoader(),  // Class loader (보통 이렇게 작성할 것이다.)
                new Class[] {Hello.class}, // Proxy가 구현해야할 interface
                new HelloUpperDynamicHandler(new HelloTarget())); // Dynamic Proxy가 호출해야할 Handler클래스.
         
        proxiedHello.sayHello("changuk");
    }
}