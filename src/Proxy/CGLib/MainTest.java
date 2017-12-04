package Proxy.CGLib;

/**
 * Created by junshuaizhang1 on 2017/12/4.
 */
public class MainTest {
    public static void main(String[] args){
        CglibProxy cglibProxy = new CglibProxy();
        Base instance = Factory.getInstance(cglibProxy);
        instance.add();

    }
}
