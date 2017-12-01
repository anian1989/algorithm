package Proxy.p1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by junshuaizhang1 on 2017/12/1.
 */
public class ProxyHandler implements InvocationHandler {
    private Object proxyId;

    public ProxyHandler(Object proxyId) {
        this.proxyId = proxyId;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(proxyId,args);
    }
}
