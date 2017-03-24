package ch2;

/**
 * 
 * @ClassName: PrimeNumber
 * @Description: 计算质数
 * @author: junshuaizhang1
 * @date: 2017年3月24日 下午3:12:23
 */
public class PrimeNumber {

	/**
	 * @Title: trialDivision
	 * @Description: 试除法计算质数 
	 * 				   思想：测试 n 是否为素数的最基本方法为试除法。此一程序将 n 除以每个大于1且小于等于 n
	 *               的平方根之整数 m。若存在一个相除为整数的结果，则 n 不是素数；反之则是个素数。实际上，若
	 *               {\displaystyle n=ab} n=a b 是个合数（其中 a 与 b ≠ 1）, 则其中一个约数 a 或
	 *               b 必定至大为 {\displaystyle {\sqrt {n}}} \sqrt{n}。例如，对
	 *               {\displaystyle n=37} n = 37 使用试除法，将37除以 m = 2, 3, 4, 5,
	 *               6，没有一个数能整除37，因此37为素数。此一程序若能知道直至 {\displaystyle {\sqrt {n}}}
	 *               \sqrt{n}的所有素数列表，因为试除法只检查 m
	 *               为素数的状况，所以会更有效率。例如，为检查37是否为素数，只有3个相除是必要的（m = 2, 3,
	 *               5），因为4与6为合数。
	 *               作为一个简单的方法，试除法在测试大整数时很快地会变得不切实际，因为可能的约数数量会随着n的增加而迅速增加。
	 *               依据下文所述之素数定理，小于 {\displaystyle {\sqrt {n}}} \sqrt{n}的素数之数量约为
	 *               {\displaystyle {\sqrt {n}}/\ln({\sqrt {n}})} \sqrt{n} /
	 *               \ln(\sqrt{n})，因此使用试除法测试 n 是否为素数时，大约会需要用到这么多的数字。对 n =
	 *               1020，此一数值约为4.5亿，对许多实际应用而言都太过庞大。
	 * @param a
	 * @return: boolean
	 */
	public boolean trialDivision(int a) {

		boolean result = true;
		for(int i=2;i<=Math.sqrt(a);i++){
			if(a%i==0){
				result = false;
				break;
			}
		}
		return result;
	}
	
	/**
	 * 
	 * @Title: aiShi
	 * @Description: 埃氏筛的方式查找n-1内的所有素数
	 * @param n
	 * @return: void
	 */
	public void aiShi(int n){
		boolean[] a =new boolean[n];
		for(int i=0;i<n;i++){
			a[i]= true;
		}
		for(int j=2;j<=Math.sqrt(n);j++){
			if(a[j]==true){
				int len = n/j;
				for(int h=2;h<=len;h++)
					a[j*h]=false;
			}
		}
		for (int i = 2; i < a.length; i++) {
			if(a[i])
				System.out.print(i+"   ");
			if(i%5==0)
				System.out.println();
		}
	}
}
