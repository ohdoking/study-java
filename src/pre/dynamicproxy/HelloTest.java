package pre.dynamicproxy;

import java.lang.reflect.Proxy;
import java.util.Map.Entry;

public class HelloTest {

	public Hello pHello;
	
	public static void main(String[] args) {
//		HelloTest t = new HelloTest();
//		t.proxytest();
//		
//		 t.pHello.sayHello("hihioh");
		
		for(Entry<Object, Object> entry : System.getProperties().entrySet()) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		
		Integer i = null ;
		System.out.println(i.getInteger("sun.arch.data.model"));
	}
	
	public void proxytest(){
		pHello = (Hello) Proxy.newProxyInstance(getClass().getClassLoader(),  // Class loader (보통 이렇게 작성할 것이다.)
                new Class[] {Hello.class}, // Proxy가 구현해야할 interface
                new HelloUpperDynamicHandler(new HelloTarget()));
	}
}
