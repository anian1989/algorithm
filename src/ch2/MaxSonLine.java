package ch2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: MaxSonLine
 * @Description: ��������кͣ��������յĺ��Ǵ���0�ģ�
 * @author: junshuaizhang1
 * @date: 2017��3��21�� ����6:26:47
 */
public class MaxSonLine {
	private static final Logger logger = LoggerFactory.getLogger(MaxSonLine.class);
	/**
	 * 
	 * @Title: basicFor
	 * @Description: ����forѭ�������������е�ֵ
	 * @param base
	 * @return: int
	 */
	public int basicFor(int[] base) {
		int max = 0;
		for (int i = 0; i < base.length; i++) {
			int tempMax = 0;
			for (int j = i; j < base.length; j++) {
				tempMax += base[j];
				if (tempMax > max)
					max = tempMax;
			}
		}
		return max;
	}

	/**
	 * @Title: subMaxSum
	 * @Description: �õݹ���ε�˼�룬��ȡ���������
	 *               ˼�룺������a��Ϊ�����֣�a���ֵ����벿�ֵ����ֵ���а벿�����ֵ�Ͱ����м�߽�Ԫ�ص����ֵ�е�һ����
	 * @param a
	 * @param left
	 * @param right
	 * @return: int
	 */
	public int subMaxSum(int[] a, int left, int right) {
		if (left == right) {
			if (a[left] > 0)
				return a[left];
			else
				return 0;//��ΪMax��ʼֵΪ0
		}
		int leftMax = 0, rightMax = 0, middleLeftMax = 0, middleRightMax = 0;
		int middle = (right + left) / 2;
		leftMax = this.subMaxSum(a, left, middle);
		rightMax = this.subMaxSum(a, middle + 1, right);
		int middleLeft = 0;
		for(int i=middle;i>=left;i--){
			middleLeft += a[i];
			if(middleLeftMax < middleLeft){
				middleLeftMax = middleLeft;
			}
		}
		int middleRight = 0;
		for(int j=middle+1;j<=right;j++){
			middleRight +=a[j];
			if(middleRightMax < middleRight){
				middleRightMax = middleRight;
			}
		}
		leftMax = Math.max(leftMax, middleRightMax+middleLeftMax);
		return Math.max(leftMax, rightMax);

	}
	/**
	 * 
	 * @Title: grandySum
	 * @Description: ̰���㷨�����������к�
	 * ˼·�� 
         * ��������п϶�������һ��������ͷ 
         * ͬ��϶�������һ�����������п�ͷ 
         * ֻҪ�����к�С��0 ��ô������sum 
         * ��������sum�Ѿ�������max 
         * ���Բ��õ������sum��ʧ 
	 * @param a
	 * @return
	 * @return: int
	 */
	public int grandySum(int[] a){
		int max = 0;
		int thisMaxSum = 0;
		for (int i = 0; i < a.length; i++) {
			thisMaxSum +=a[i];
			if(thisMaxSum>max)
				max = thisMaxSum;
			else if(thisMaxSum<0)
				thisMaxSum = 0;
		}
		return max;
	}
}
