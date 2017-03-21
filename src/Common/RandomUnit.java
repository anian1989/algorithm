package Common;

import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

/**
 * 
 * @ClassName: RandomUnit
 * @Description: ���ɸ��������
 * @author: junshuaizhang1
 * @date: 2017��3��20�� ����2:21:48
 */

public class RandomUnit {
	
	/**
	 * 
	 * @Title: rangOne
	 * @Description:����[-rang,rang]֮��������
	 * @param rang
	 * @return: int
	 */
	public int rangOne(int rang){
		if(rang <2){
			return 0;
		}
		int flag = (int)(Math.random()*1000);//������־λ
		flag = flag%2;
		if(flag == 1){//
			return negativeAndpositive(rang*-1);
		}else
			return negativeAndpositive(rang);
			
	}
	/**
	 * 
	 * @Title: negativeAndpositive
	 * @Description: ����[0,|rang|]֮��������������rang����������������
	 * @param rang ��Ϊ��������
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
	 * @Description: ����һ��0����1�ı�־λ
	 * @return: int
	 */
	public int getFlag(){
		int flag = (int)(Math.random()*1000);//������־λ
		flag = flag%2;
		return flag;
	}
	/**
	 * 
	 * @Title: minAndMax
	 * @Description: ����[min,max]֮�������
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
	 * @Description: ��ȡһ��������length�ķ�Χ��[min,max]֮�����������У�����
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
	 * @Description: ��ȡһ�����ظ������������
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
