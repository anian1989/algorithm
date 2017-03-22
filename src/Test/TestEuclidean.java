package Test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch2.Euclidean;

public class TestEuclidean {
	private static final Logger logger = LoggerFactory.getLogger(TestEuclidean.class);
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
		Euclidean euclidean = new Euclidean();
		
		int maxCommonDivisor = euclidean.maxCommonDivisor(1024, 128);
		logger.info(""+maxCommonDivisor);
	}

}
