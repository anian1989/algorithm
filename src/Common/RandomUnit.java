package Common;

import java.util.Arrays;
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
	 * @return: int
	 */
	public int negativeAndpositive(int rang){
		if(rang==0) return 0;
		int abs = Math.abs(rang);
		int random = (int)(Math.random()*abs);
		return random*abs/rang;		
	}
	
	/**
	 * 
	 * @Title: getFlag
	 * @Description: 返回一个0或者1的标志位
	 * @return: int
	 */
	public int getFlag(){
		int flag = (int)(Math.random()*1000);//正负标志位
		flag = flag%2;
		return flag;
	}
	/**
	 * 
	 * @Title: minAndMax
	 * @Description: 生成[min,max]之间的数据
	 * @param min
	 * @param max
	 * @return: int
	 */
	
	public int minAndMax(int min,int max){
		if(min >= max){
			return 0;
		}
		if(min <0&& max >0){
			if(this.getFlag()==1){
				return this.negativeAndpositive(max);
			}else
				return this.negativeAndpositive(min);
		}
		return this.negativeAndpositive(max-min)+min;
		
	}
	/**
	 * @Title: getArrays
	 * @Description: 获取一个长度是length的范围在[min,max]之间的随机数序列，乱序
	 * @param length
	 * @param min
	 * @param max
	 * @return: int[]
	 */
	public int[] getArrays(int length,int min,int max){
		if(length<1){
			return null;
		}
		int[] arrays = new int[length];
		for (int i=0 ; i<arrays.length;i++) {
			arrays[i] = this.minAndMax(min, max);
		}
		return arrays;
	}
	/**
	 * @Title: getArrysNotRepeat
	 * @Description: 获取一个不重复的随机数数组
	 * @param length
	 * @param min
	 * @param max
	 * @return: int[]
	 */
	public int[] getArrysNotRepeat(int length,int min,int max){
		if(length<1||length>(max-min)){
			return null;
		}
		int[] arrays = new int[length];
		int i=0;
		while(i !=arrays.length) {
			int key = this.minAndMax(min, max);
			int binarySearch = Arrays.binarySearch(arrays, key);
			if(binarySearch <0){
				arrays[i] = key;
				i++;
			}
			
		}
		return arrays;
	}
	
	
}
