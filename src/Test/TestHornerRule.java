package Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Common.RandomUnit;
import ch2.HornerRule;

public class TestHornerRule {
	RandomUnit randomUnit = new RandomUnit();
	private static final Logger logger = LoggerFactory.getLogger(TestHornerRule.class);
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		HornerRule hornerRule = new HornerRule();
		int[] arrays = randomUnit.getArrays(4, -10, 10);
		logger.info(Arrays.toString(arrays));
		double hornerRule2 = hornerRule.HornerRule(2, arrays);
		logger.info("结果："+hornerRule2);
	}

}
