package ch2;

import java.math.BigInteger;

/**
 * 
 * @ClassName: TestBIgInt
 * @Description: ���ڼ���X^n ��˼���� ���n��ż����X^n=(X^n/2) ���һֱ�ֲ�������������ٳ�X
 * @author: junshuaizhang1
 * @date: 2017��3��18�� ����2:56:28
 */
public class TestBIgInt {

	public static int LENGTH = 10000000;//n�η�
	public static BigInteger bigInteger = new BigInteger("2");//����
	/**
	 * 
	 * @Title: main
	 * @Description: ���ڼ���X^n ��˼���� ���n��ż����X^n=(X^n/2) ���һֱ�ֲ�������������ٳ�X
	 * @param args
	 * @return: void
	 */
	public static void main(String[] args) {
		 
		
		 bigInteger = new BigInteger("2");
		 long currentTimeMillis = System.currentTimeMillis();
		 BigInteger bin = bin(bigInteger,LENGTH);
		 System.out.println(bin);
		 System.out.println(System.currentTimeMillis()-currentTimeMillis);
		 
		 System.out.println("--------------------------------------------");
		 
		 old();//��������
	}
	
	
	public static BigInteger bin(BigInteger bigInteger,int n ){
		if(n==1)
			return bigInteger;
		else
			 if(n%2==1){
				BigInteger bin = bin(bigInteger,n/2);
				BigInteger multiply = bin.multiply(bin);
				return bigInteger.multiply(multiply);
			}else{
				BigInteger bin = bin(bigInteger,n/2);
				BigInteger multiply = bin.multiply(bin);
				return multiply;
			}
	}
	
	public static void old(){
		System.out.println();
		long currentTimeMillis = System.currentTimeMillis();
		 for(int i=1;i<LENGTH;i++){
			 bigInteger = bigInteger.multiply(new BigInteger("2"));
		 }
		 System.out.println(bigInteger.toString());
		 System.out.println(System.currentTimeMillis()-currentTimeMillis);
	}

}
