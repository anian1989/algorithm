package Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Test;

import com.alibaba.fastjson.JSON;

import Common.RandomUnit;
import ch2.MaxSonLine;

public class TestCommon {
	RandomUnit randomUnit = new RandomUnit();
	private static final Logger logger = LoggerFactory.getLogger(TestCommon.class);
	@Test
	public void testRondom(){
		/*for (int i = 0; i < 100; i++) {
			
			logger.info(randomUnit.minAndMax(0,100));
		}*/
		long currentTimeMillis = System.currentTimeMillis();
		int[] arrays = randomUnit.getArraysNotRepeat(100, -10, 100000);
		logger.info("Ê±¼ä"+(System.currentTimeMillis()-currentTimeMillis));
		for (int i = 0; i < arrays.length; i++) {
			logger.info(""+arrays[i]);
		}
	}
	@Test
	public void testMaxSonLine1(){
		int[] arrays = randomUnit.getArrays(800000, -10000, 10000);
		String jsonString = JSON.toJSONString(arrays);
//		logger.info(jsonString);
		long currentTimeMillis = System.currentTimeMillis();
		MaxSonLine maxSonLine = new MaxSonLine();
		int basicFor = maxSonLine.basicFor(arrays);
		logger.info(""+(System.currentTimeMillis()-currentTimeMillis));
		logger.info(""+basicFor);
		currentTimeMillis = System.currentTimeMillis();
		int subMaxSum = maxSonLine.subMaxSum(arrays, 0, arrays.length-1);
		logger.info(""+(System.currentTimeMillis()-currentTimeMillis));
		logger.info(""+subMaxSum);
		
		
	}
}
