package Test;

import Common.RandomUnit;
import Moock.Sort.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by junshuaizhang1 on 2017/5/17.
 */
public class TestSort {

    private RandomUnit randomUnit = new RandomUnit();
    private static final Logger logger = LoggerFactory.getLogger(TestSort.class);
    private static long STARTTIMEMILLIS = 0L;
    private static int LENGTH = 10;
    private static int MIN = 1;
    private static int MAX = 10;

    @Before
    public  void  before(){
        STARTTIMEMILLIS = System.currentTimeMillis();
        logger.info("开始时间"+STARTTIMEMILLIS);
    }

    @After
    public void after(){
        long l = System.currentTimeMillis();

        logger.info("耗费时间："+(l-STARTTIMEMILLIS));
    }

    private void print(Sort selectSort){
        this.printV2(selectSort,true,true);
    }

    /**
     *
     * @param selectSort 排序方式
     * @param primitive 是否打印生成的随机数
     * @param result 是否打印结果
     */
    private void printV2(Sort selectSort,boolean primitive,boolean result){
        int[] arrays = randomUnit.getArrays(LENGTH, MIN, MAX);
        if (primitive){
            System.out.println();
            for (int i: arrays  ) {
                System.out.print(i+",");
            }
            System.out.println();
        }
        arrays= selectSort.sort(arrays);
        if (result){
            System.out.println();
            for (int i: arrays  ) {
                System.out.print(i+",");
            }
            System.out.println();
        }
    }
    @Test
    public void testSelectSort(){
        this.print(new SelectSort());
    }
    @Test
    public void testInsertSort(){
        LENGTH = 200000;
        MAX = 200000;
        this.print(new InsertSort());
    }
    @Test
    public void testMaopaoSort(){
        LENGTH = 10;
        MAX = 200;

        this.print(new ExchangeSort());
    }

    @Test
    public void testMergeSort(){
        LENGTH = 10;
        MAX = 20;

        this.print(new MergeSort());
    }
    @Test
    public void testQuickSort(){
        LENGTH = 500000;
        MAX = LENGTH*10;

        this.printV2(new QuickSort(),false,false);
    }


    @Test
    public void testHeapSort(){
        LENGTH = 10;
        MAX = LENGTH*10;

        this.printV2(new HeapSort(),true,true);
    }


}
