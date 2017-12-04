package Proxy.p2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by junshuaizhang1 on 2017/12/4.
 */
public class proxyHandler implements InvocationHandler {
    private Object object;

    public proxyHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("---------------------前部日志--------------------------");
        Object invoke = method.invoke(object, args);
        System.out.println("---------------------后部日志--------------------------");
        return invoke;
    }
}
