package Moock.Sort;

/**
 * Created by junshuaizhang1 on 2017/5/18.
 * 插入排序：类似打扑克牌时候整理手中的牌，将未排序的在已经排序的里面找到合适位置
 */
public class InsertSort implements Sort{

    @Override
    public int[] sort(int[] a) {
        return this.sortBasic(a);
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
}
