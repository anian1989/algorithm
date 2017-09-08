package EffectiveJava.aCreateOrDestroyObject;

/**
 * Created by junshuaizhang1 on 2017/9/6.
 * 第2条：遇到多个构造器参数时要考虑用构建器
 * 创建实例的时候，有的属性可以不填，有的属性要校验
 * 有三种方式处理这种情况
 * 1、重叠构造器模式（即每种情况都造个构造器）可行，但是当有许多参数的时候，客户端代码会很难编写，并且仍然难以阅读；
 * 2、JavaBeans模式（即调用一个无参构造器来创建对象，然后调用setter方法来设置每个必要的参数，以及每个相关的可选参数），这种方式不能保证线程的安全，
 *                 当对象的构造完成，并且不允许再解冻之前使用时，通过手工“冻结”对象，可以弥补这些不足。
 * 3、Builder模式（推荐），参见{@link NutritionFacts}
 */
public class MoreParam {
}
