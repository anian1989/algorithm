package Moock.Sort;

import Common.RandomUnit;
import com.alibaba.fastjson.JSONArray;

/**
 * Created by junshuaizhang1 on 2017/5/23.
 * 快速排序:快速排序的核心思想是对于制定的数据找到排序后的正确位置
 */
public class QuickSort extends   SortCommon implements Sort {
    @Override
    public int[] sort(int[] a) {
        return this.quickSortOneWayRecursive(a,0,a.length-1);
    }

    /**
     * 单路递归实现
     * 思想：找到pivot在排序之后的正确位置，并且放到该位置，其他变量只要按照大小分布在两侧即可；
     * @param a
     * @param start
     * @param end
     * @return
     */
    private  int[] quickSortOneWayRecursive(int[] a,int start,int end){
        if (start>= end)
            return a;
        int l = start;
        RandomUnit randomUnit = new RandomUnit();
        int pivotInd = randomUnit.minAndMax(start,end);
        //此处是随机选用pivot，这样能有效减少 在a是接近逆向有序时花费的时间
        swap(a, start, pivotInd);

        int pivot = a[start];
        /**
         * 说明：
         * 1、小于等于l下标的数据都是小于等于a[start]的数据
         * 2、下标i的遍历l之后第一个小于a[start]的坐标
         */
        for (int i = start+1; i <= end ; i++) {
            if (a[i] < pivot){
                swap(a,i,++l);
            }
        }
        //将a[start] 放到正确的位置上
        swap(a,l,start);
        quickSortOneWayRecursive(a,start,l-1);
        quickSortOneWayRecursive(a,l+1,end);
        return  a;
    }


    /**
     * 2、递归实现快速排序:两路快排
     * @param a
     * @return
     */

    private int[] quickSortTwoWayRecursive(int[] a,int start,int end){
        if (start >= end)
            return a;
        int pivot = a[end];//基准数据（此处取最后一个值)
        int left = start;
        int right = end-1;
        while (left < right){
            while (a[left]<=pivot&&left <right)
                left++;
            while (a[right]>=pivot&&right>left)
                right--;
            swap(a,left,right);
        }
        if (a[left] >=pivot )
            swap(a,left,end);
        else
            left++;

        quickSortTwoWayRecursive(a,start,left-1);
        quickSortTwoWayRecursive(a,left+1,end);

        return a;
    }


}
