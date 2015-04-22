package pre.dynamicproxy;
 
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
 
public class HelloUpperDynamicHandler implements InvocationHandler {
    private Hello hello; // Target
     
    public HelloUpperDynamicHandler(Hello hello) {
        this.hello = hello;
    }
 
    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        // TODO Auto-generated method stub
        // Client가 어떠한 메소드를 호출했는지 파라미터로 넘어온 method를 통해 알 수 있다.
        // target인 hello객체를 넘겨주면 Client가 hello의 메소드를 호출한 것과 동일하게 호출하게 된다.
        String ret = (String)method.invoke(hello, args); 
        return ret.toUpperCase();
    }
 
}