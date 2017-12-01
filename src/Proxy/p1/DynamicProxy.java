package Proxy.p1;

import sun.misc.ProxyGenerator;

import java.lang.reflect.Proxy;

/**
 * Created by junshuaizhang1 on 2017/12/1.
 */
public class DynamicProxy {
    public static void main(String args[]){
        RealSubject realSubject = new RealSubject();
        Subject subject = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(), new Class[]{Subject.class}, new ProxyHandler(realSubject));
        subject.doSomething();
        createProxyClassFile();
    }

    public static void createProxyClassFile(){
        String name = "ProxySubject";
        byte[] bytes = ProxyGenerator.generateProxyClass(name, new Class[]{Subject.class});
        try{

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
