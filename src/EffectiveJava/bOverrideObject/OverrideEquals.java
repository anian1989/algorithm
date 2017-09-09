package EffectiveJava.bOverrideObject;

/**
 * Created by junshuaizhang1 on 2017/9/7.
 *在覆盖equals方法的时候，必须遵守它的通用约定
 * 1、自反性；
 * 2、对称性；
 * 3、传递性；
 * 4、一致性；
 * 5、非空性：对于任何非null的引用值x，x.equals(null)必须返回false
 *
 * 诀窍：
 * 1、使用==操作符检查“参数是否为这个对象的引用”；
 * 2、使用instanceof操作符检查“参数是否为正确的类型”；
 * 3、把参数转换成正确的类型；
 * 4、对于该类中的每个“关键”域，检查参数中的域是否与该对象中对应域相匹配；
 * 5、当编写完成之后，应该检测对称性、传递性、一致性。
 *
 *
 */
public class OverrideEquals {

}
