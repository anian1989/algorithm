package Common;

import java.util.Random;

import org.junit.Test;

/**
 * 
 * @ClassName: RandomUnit
 * @Description: 生成各种随机数
 * @author: junshuaizhang1
 * @date: 2017年3月20日 下午2:21:48
 */

public class RandomUnit {
	
	/**
	 * 
	 * @Title: rangOne
	 * @Description:返回[-rang,rang]之间的随机数
	 * @param rang
	 * @return
	 * @return: int
	 */
	public int rangOne(int rang){
		if(rang <2){
			return 0;
		}
		int flag = (int)(Math.random()*1000);//正负标志位
		flag = flag%2;
		if(flag == 1){//
			return negativeAndpositive(rang*-1);
		}else
			return negativeAndpositive(rang);
			
	}
	/**
	 * 
	 * @Title: negativeAndpositive
	 * @Description: 生成[0,|rang|]之间的随机数，根据rang的正负，返回正负
	 * @param rang 可为正数负数
	 * @return
	 * @return: int
	 */
	public int negativeAndpositive(int rang){
		if(rang==0) return 0;
		int abs = Math.abs(rang);
		int random = (int)(Math.random()*abs);
		return random*abs/rang;		
	}

}
