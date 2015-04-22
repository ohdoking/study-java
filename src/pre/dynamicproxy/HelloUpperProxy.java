package pre.dynamicproxy;
public class HelloUpperProxy implements Hello {
    Hello hello;
     
    public HelloUpperProxy(Hello hello) {
        this.hello = hello;
    }
 
    @Override
    public String sayHello(String name) {
        // TODO Auto-generated method stub
        return hello.sayHello(name).toUpperCase();
    }
 
    @Override
    public String sayHi(String name) {
        // TODO Auto-generated method stub
        return hello.sayHi(name);
    }
 
    @Override
    public String sayThankyou(String name) {
        // TODO Auto-generated method stub
        return hello.sayThankyou(name);
    }
 
}