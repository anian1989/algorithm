package Test;

import org.junit.Test;

import Common.RandomUnit;

public class TestCommon {
	@Test
	public void testRondom(){
		RandomUnit randomUnit = new RandomUnit();
		for (int i = 0; i < 100; i++) {
			
			System.out.println(randomUnit.rangOne(2000));
		}
	}
}
