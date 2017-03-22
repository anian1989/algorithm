package ch2;  
/**
 *   
 * @ClassName: HornerRule
 * @Description: 霍纳法则  2-4x+5x²+7x³=2+x{-4+x(5+7x)}  减少乘法运算
 * {@linkplain http://www.wutianqi.com/?p=1426&winzoom=1}
 * @author: junshuaizhang1
 * @date: 2017年3月22日 下午5:25:28
 */
public class HornerRule {

	//Calculate the value of an*x^n + an-1*x^(n-1) + ... a2*x^2 + a1*x + a0
	/**
	 * 
	 * @Title: HornerRule
	 * @Description: 霍纳法则计算方程式数，最高次幂是a[]的长度-1
	 * @param x 底数
	 * @param a 系数数组
	 * @return: double 
	 */
	public double HornerRule(double x,int[] a){
		double result = 0;
		for(int i=a.length-1;i>=0;i--){
			result = result*x+a[i];
		}
		return result;
	}
}
