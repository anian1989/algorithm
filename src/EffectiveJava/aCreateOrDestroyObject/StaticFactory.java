package EffectiveJava.aCreateOrDestroyObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by junshuaizhang1 on 2017/9/6.
 * 静态工厂方法代替构造器
 */
public class StaticFactory {
//  一  优点
//    1、静态工厂方法与构造器不同的第一大优势在于，它们有名称方便理解和使用；
//    2、第二个优势，不必在每次调用它们的时候都创建一个新对象；例如 Boolean.valueOf()
//    3、第三个优势，它们可以返回原返回类型的任何子类型的对象；例如EnumSet的nonof方法
//    4、第四大优势，在创建参数化类型实例的时候，它们使代码变得更加简洁。
    public static  void  main(String a[]) {

        Boolean aBoolean = Boolean.valueOf(true);
        System.out.println(aBoolean.hashCode());

        Boolean aBoolean1 = Boolean.valueOf(true);
        System.out.println(aBoolean1.hashCode());
        aBoolean = false;
        System.out.println(aBoolean.hashCode());


    }
    //二   缺点
//    1、类如果不包含共有的或者受保护的构造器，就不能被子类化；
//    2、它们与其他的静态方法实际上没有任何区别

//   三  惯用语
//    valueOf 不太严格地讲，该方法返回的实例与它的参数具有相同的值这样的静态工厂方法实际上是类型转化方法；例如 Integer中
//    of      valueOf的一种更为简洁的替代，在EnumSet中使用并流行起来；
//    getInstance 返回的实例使用过方法的参数来描述的，但是不能够说与参数具有同样的值。对于Singleton来说，该方法没有参数，并返回唯一的实例。例如 Calendar中
//    newInstance 像getInstance一样，但newInstance能够确保返回的每个实例都与所有其他实例不同。
//    getType 像getInstance一样，但是在工厂方法处于不同的类中的时候使用。Type表示工厂方法所返回的对象类型
//    newType 像newInstance一样，但是在工厂方法处于不用的类中的时候使用。Type表示工厂方法所返回的对象类型



}
