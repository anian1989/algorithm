package Common;

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
	 * @return
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
