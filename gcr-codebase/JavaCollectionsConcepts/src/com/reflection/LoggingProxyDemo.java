package com.reflection;
import java.lang.reflect.*;
import java.util.Date;

interface Greeting {
    void sayHello(String name);
    void sayGoodbye();
}

class GreetingImpl implements Greeting {
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }
    
    public void sayGoodbye() {
        System.out.println("Goodbye!");
    }
}

class LoggingHandler implements InvocationHandler {
    private Object target;
    
    public LoggingHandler(Object target) {
        this.target = target;
    }
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("[" + new Date() + "] Calling method: " + method.getName());
        
        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                System.out.println("  arg" + i + ": " + args[i]);
            }
        }
        
        return method.invoke(target, args);
    }
}

public class LoggingProxyDemo {
    public static void main(String[] args) {
        Greeting realGreeting = new GreetingImpl();
        
        Greeting proxy = (Greeting) Proxy.newProxyInstance(
            Greeting.class.getClassLoader(),
            new Class<?>[] { Greeting.class },
            new LoggingHandler(realGreeting)
        );
        
        proxy.sayHello("Divyansh");
        proxy.sayGoodbye();
    }
}