package Moock.Sort;

/**
 * Created by junshuaizhang1 on 2017/5/18.
 * 冒泡排序：相邻的元素比较，然后交换位置，之后比较到最后一个
 */
public class ExchangeSort implements Sort{
    @Override
    public int[] sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = a.length -1; j >i; j--) {
                if (a[j]<a[j-1] ){
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
            }
        }
        return a;
    }
}
