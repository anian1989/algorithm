package Test;

import ch2.SuffixMiddleExpression;
import org.junit.Test;

import java.util.ArrayList;

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
}
