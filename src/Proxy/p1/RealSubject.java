package Proxy.p1;

/**
 * Created by junshuaizhang1 on 2017/12/1.
 */
public class RealSubject implements Subject {
    @Override
    public void doSomething() {
        System.out.println("RealSubject");
    }
}
