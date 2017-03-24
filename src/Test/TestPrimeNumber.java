package Test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch2.PrimeNumber;

public class TestPrimeNumber {

	private static final Logger logger = LoggerFactory.getLogger(TestPrimeNumber.class);
	PrimeNumber primeNumber = new PrimeNumber();
	@Test
	public void testTrialNumber(){
		int length = 100;
		for(int i=5;i<length;i++){
			boolean trialDivision = primeNumber.trialDivision(i);
			if(trialDivision)
				logger.info(i+"是质数");
			/*else
				logger.info(i+"不是质数");*/
		}
	}
	
	@Test
	public void testAishi(){
		primeNumber.aiShi(10);
	}
}
