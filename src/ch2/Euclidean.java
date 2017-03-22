package ch2;  
/**
 * 
 * @ClassName: Euclidean
 * @Description: 欧几里得算法（计算最大公约数），也称为辗转相除法
 * @author: junshuaizhang1
 * @date: 2017年3月22日 下午8:47:42
 */
public class Euclidean {

	/**
	 * 
	 * @Title: maxCommonDivisor
	 * @Description: 最大公约数
	 * @param a a>b
	 * @param b
	 * @return: int
	 */
	public int maxCommonDivisor(int a,int b){
		if(a<=0|| b<=0)
			return -1;
		while(b!=0){
			int r = b;
			b = a%b;
			a =r;
		}
		return a;
	}
}
