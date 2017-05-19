package Moock.Sort;

/**
 * Created by junshuaizhang1 on 2017/5/18.
 * 插入排序：类似打扑克牌时候整理手中的牌，将未排序的在已经排序的里面找到合适位置
 */
public class InsertSort implements Sort{

    @Override
    public int[] sort(int[] a) {
        return this.shellSort(a);
    }

    /**
     * 基本版的
     * @param a
     * @return
     */
    public  int[] sortBasic(int[] a){
        for (int i = 1; i < a.length ; i++) {
            int h = i;
            for (int j = i-1   ; j >=0 && a[h] < a[j] ; h = j--) {
                a[h] = a[h] + a[j];
                a[j] = a[h] -a[j];
                a[h] = a[h] -a[j];
            }
        }
        return a;
    }

    /**
     * 希尔排序，希尔排序最主要的是设计步进值  此处用下面的步进值
     * <O(n^(3/2)) by Knuth,1973>: 1, 4, 13, 40, 121, ...
     * @param a
     * @return
     */
    /*public int[] shellSort(int[] a){
        if (null == a || a.length <1)
            return a;
        int Step = 1;
        while (Step < a.length/3)
            Step = Step*3 +1;//计算最大步进值
        while (Step >0){
            for (int j = 0; j < Step; j++) {
                for (int i = j+Step;i<a.length;i+=Step){
                    for (int k = i; k >=Step && a[k] < a[k-Step]; k--) {
                        a[k] = a[k]+ a[k-Step];
                        a[k-Step] = a[k] -a[k-Step];
                        a[k] = a[k] -a[k-Step];
                    }
                }
            }
            Step = Step/3;
        }
        return a;
    }*/

    public int[] shellSort(int[] a){
        if (null == a || a.length <1){
            return a;
        }
        int Step =1;
        while (Step < a.length)
            Step = Step*3+1;
        while (Step >0){

            for (int i = 0; i < Step; i++) {
                for (int j = i+Step; j <a.length && a[j]< a[j-Step]; j+=Step) {
                    a[j] = a[j] + a[j-Step];
                    a[j-Step] = a[j] - a[j-Step];
                    a[j] = a[j] - a[j-Step];
                }
            }
            Step = Step/3;
        }

        return a;
    }

}
