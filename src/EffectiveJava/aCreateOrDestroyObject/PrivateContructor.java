package EffectiveJava.aCreateOrDestroyObject;

/**
 * Created by junshuaizhang1 on 2017/9/6.
 * 第4条：通过私有构造器强化不可实例化的能力
 * 1、java.lang.Math或者java.util.Arrays只包含静态方法和静态域，把基本类型的值或者数组类型上的相关方法组织起来；
 * 2、java.util.Collections的方式，把实现特定接口的对象上的静态方法组织起来；
 * 3、企图通过姜磊做成抽象类来强制该类不可被实例化，这是不可行的；
 *
 * 参考 {@link java.util.Collections}
 */
public class PrivateContructor {
}
