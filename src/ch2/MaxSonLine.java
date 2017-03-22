package ch2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: MaxSonLine
 * @Description: 最大子序列和（假设最终的和是大于0的）
 * @author: junshuaizhang1
 * @date: 2017年3月21日 下午6:26:47
 */
public class MaxSonLine {
	private static final Logger logger = LoggerFactory.getLogger(MaxSonLine.class);
	/**
	 * 
	 * @Title: basicFor
	 * @Description: 利用for循环查出最大子序列的值
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
	 * @Description: 用递归分治的思想，获取最大子序列
	 *               思想：将数组a分为两部分，a最大值是左半部分的最大值、有半部分最大值和包含中间边界元素的最大值中的一个。
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
				return 0;//因为Max初始值为0
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
	 * @Description: 贪心算法解决最大子序列和
	 * 思路： 
         * 最大子序列肯定不是以一个负数开头 
         * 同理肯定不是以一个负的子序列开头 
         * 只要子序列和小于0 那么就重置sum 
         * 但是最大的sum已经保存在max 
         * 所以不用担心最大sum丢失 
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
