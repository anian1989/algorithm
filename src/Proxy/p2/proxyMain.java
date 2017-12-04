package Proxy.p2;

import java.lang.reflect.Proxy;

/**
 * Created by junshuaizhang1 on 2017/12/4.
 */
public class proxyMain {

    public static void main(String[] args){
        proxyImpl proxy = new proxyImpl();

        proxyHandler proxyHandler = new proxyHandler(proxy);

        proxyInterface proxyInterface = (proxyInterface) Proxy.newProxyInstance(proxyImpl.class.getClassLoader(),
                proxyImpl.class.getInterfaces(), proxyHandler);
        proxyInterface.sayHellp();

    }
}
