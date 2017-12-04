package Proxy.CGLib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by junshuaizhang1 on 2017/12/4.
 */
public class CglibProxy implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("---------------前面---------------");
        methodProxy.invokeSuper(o,args);
        System.out.println("---------------后面---------------");
        return null;

    }
}
