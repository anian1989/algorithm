package EffectiveJava.bOverrideObject;

/**
 * Created by LENOVO on 2017/9/9.
 * 在每个覆盖了equals方法的类中，也必须覆盖hashCode方法。如果不这样做的话，就会违反了Object.hashCode
 * 的通用约定，从而导致该类无法结合所有基于散列的集合一起正常运作，如HashMap、HashSet和Hashtable。
 *
 * 解决自己重写 hashCode的方法
 * 1、把某个非零的长数值，比如说17，保存在一个名为result的int类型的变量中；
 * 2、对于对象中每个关键域f（指equals方法中设计的每个域），完成以下步骤：
 *      a、为该域计算int类型的散列码c:
 *          1、如果该域是boolean类型，则计算（f？1：0）；
 *          2、如果该域是byte、char、short或者int类型，则计算（int）f；
 *          3、如果该域是long类型，则计算（int）（f^(f>>>32));
 *          4、如果该域是float类型，则计算Float.floatToIntBits(f);
 *          5、如果该域是double类型，则计算Double.doubleToLongBits(f),然后按照步骤2.a.3，为得到的long类型值计算散列值。
 *          6、如果该域是一个对象引用，并且该类的equals方法通过递归地调用equals的方式来比较这个域，
 *             则同样为这个域递归地调用hashCode。如果需要更复杂的比较，则为这个域计算一个“范式”，然后
 *             针对这个范式调用hashCode。如果这个域的值为null，则返回0。
 *          7、如果该域是一个数组，则要把每一个元素当做单独的域来处理。也就是说，递归地应用上述规则，对
 *          每个重要的元素计算一个散列码，然后根据步骤2.b中的做法把这些散列值组合起来。如果数组域中的每个
 *          元素都和重要，可以利用发行版本1.5中增加的其中一个Arrays.hashCode方法。
 *      b、按照下面的公式，把步骤2.a中计算得到的散列码c合并到result中：
 *          result=31*result+c；
 *   3、返回result。
 *
 * */
public class OverrideHashCode {
    public static void main(String[] args) {

        Float f = new Float("2.1");

        //returns the bits that represent the floating-point number
        System.out.println("Value = " + f.floatToRawIntBits(f));
    }
}
