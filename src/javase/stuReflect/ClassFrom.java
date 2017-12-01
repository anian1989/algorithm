package javase.stuReflect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by junshuaizhang1 on 2017/11/9.
 */
public class ClassFrom {
    @Test
    public void test(){
        try {
            Class<?> aClass = Class.forName("javase.stuReflect.Person");
            Field[] declaredFields = aClass.getDeclaredFields();
            System.out.println("========获取成员属性信息============");
            for (Field f :declaredFields){
                System.out.println(f.toString());
            }

            Class<?>[] classes = aClass.getClasses();
            System.out.println("========获取成员Class信息============");
            for (Class c : classes){
                System.out.println(c.getName());
            }

            Method[] declaredMethods = aClass.getDeclaredMethods();
            System.out.println("========获取成员方法信息============");
            for (Method m :declaredMethods){
                System.out.println(m.toString());
            }

            Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
            System.out.println("========获取成员gouzao方法信息============");
            for (Constructor c : declaredConstructors){
                System.out.println(c.toString());
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
