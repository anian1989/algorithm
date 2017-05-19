package Moock.Sort;

/**
 * Created by junshuaizhang1 on 2017/5/17.
 * 选择排序
 */
public class SelectSort implements  Sort{
    /**
     * 选择排序:从未排序的里面选择出最小的，放到前面
     * @param a
     * @return
     */
    public int[] sort(int[] a){

        int min = 0;
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            min = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[j]< a[min])
                    min = j;
            }
            if (min != i){
                temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
        }
        return a;
    }
}
