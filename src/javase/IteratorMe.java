package javase;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
/**
 * 
 * @ClassName: IteratorMe
 * @Description: Iterator接口的实现是在各个Collection里面，用私有内部类实现，且是static的，调用主类实例的变量时用类似ArrayList.this.length的方式
 * @author: junshuaizhang1
 * @date: 2017年3月28日 上午10:56:28
 */
public class IteratorMe {

	public static void diceng(){
		ArrayList arrayList = new ArrayList();
		LinkedList linkedList = new LinkedList();
	}
	/**
	 * 
	 * @Title: main
	 * @Description: 对forEachRemaining测试
	 * @param args
	 * @return: void
	 */
	public static void main(String []args){
		Collection<String> c=new HashSet<String>();
		c.add("ni");
		c.add("hao");
		c.add("java");
		Iterator<String> it=c.iterator();//使用泛型
		it.forEachRemaining(System.out::println);
	}
}
