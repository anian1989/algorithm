package Proxy.CGLib;

import net.sf.cglib.proxy.Enhancer;

/**
 * Created by junshuaizhang1 on 2017/12/4.
 */
public class Factory {
    public static Base getInstance(CglibProxy proxy){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Base.class);
        enhancer.setCallback(proxy);
        Base base = (Base) enhancer.create();
        return base;
    }
}
