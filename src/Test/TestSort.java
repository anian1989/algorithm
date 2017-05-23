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
        int[] arrays = randomUnit.getArrays(LENGTH, MIN, MAX);
        System.out.println();
        for (int i: arrays  ) {
            System.out.print(i+",");
        }
        System.out.println();
        arrays= selectSort.sort(arrays);
        System.out.println();
        for (int i: arrays  ) {
            System.out.print(i+",");
        }
        System.out.println();
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
        MAX = 200;

        this.print(new MergeSort());
    }



}
