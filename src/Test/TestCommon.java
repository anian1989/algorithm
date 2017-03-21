package Test;

import org.junit.Test;

import Common.RandomUnit;

public class TestCommon {
	@Test
	public void testRondom(){
		RandomUnit randomUnit = new RandomUnit();
		/*for (int i = 0; i < 100; i++) {
			
			System.out.println(randomUnit.minAndMax(0,100));
		}*/
		long currentTimeMillis = System.currentTimeMillis();
		int[] arrays = randomUnit.getArrysNotRepeat(100000, -10, 100000);
		System.out.println("Ê±¼ä"+(System.currentTimeMillis()-currentTimeMillis));
		for (int i = 0; i < arrays.length; i++) {
			System.out.println(arrays[i]);
		}
	}
}
