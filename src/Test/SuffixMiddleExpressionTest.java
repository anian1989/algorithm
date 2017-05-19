package Test;

import ch3.SuffixMiddleExpression;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by junshuaizhang1 on 2017/3/31.
 */
public class SuffixMiddleExpressionTest {
    @Test
    public  void test(){
        SuffixMiddleExpression suffixMiddleExpression = new SuffixMiddleExpression();
        String[] middle = {"3","+","8","*","16","/","(","1","-","3",")","^","2","^","3"};
        ArrayList<String> results = suffixMiddleExpression.MiddleToSuffix(middle);
        /*for (int j=0;j<results.size();j++){
            System.out.print(results.get(j)+"   ");
        }*/
        System.out.println("--------------------------------");
        double compute = suffixMiddleExpression.compute(middle);
        System.out.println("结果："+compute);

    }

    /**
     * 实验SE的一个用法
     */
    @Test
    public void test2(){
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(0);
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        int i =1;
        int last = 0;
        System.out.println(integers.get(last = i));
        System.out.println(last);
    }
}
