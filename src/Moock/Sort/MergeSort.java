package Moock.Sort;

/**
 * Created by junshuaizhang1 on 2017/5/22.
 * 归并排序：将有序的子序列合并到一起
 * 1、递归方式实现有两种；
 * 2、迭代方式有一种
 */
public class MergeSort implements Sort{
    @Override
    public int[] sort(int[] a) {
        /*int[] result = new int[a.length];
        return this.mergeSortRecursive(a,result,0,a.length-1);*/
        return this.mergeSortInteration(a);
    }

    /**
     * 递归方式实现归并排序
     * @param a
     * @param result
     * @param start
     * @param end
     * @return
     */
    public int[]  mergeSortRecursive(int[] a,int[] result,int start,int end){
        if (start >= end)
            return a;
        int mid = (start + end)/2;
        mergeSortRecursive(a,result,start,mid);
        mergeSortRecursive(a,result,mid+1,end);
        int low = start;
        int hight = mid+1;
        int tempIndex = start;
        while (low <= mid&&hight<= end){
            result[tempIndex++] = a[low] < a[hight] ? a[low++]:a[hight++];
        }
        while(low <=mid){
            result[tempIndex++] = a[low++];
        }
        while (hight<=end){
            result[tempIndex++] = a[hight++];
        }

        System.arraycopy(result,start,a,start,end-start+1);
        return a;
    }
    /**
     * 归并排序：迭代实现
     * @param a
     * @return
     */
    public int[] mergeSortRecursive(int[] a){
        if (a == null || a.length == 1)
            return a;
        //-----------数据分组-----------
        int[] temp = new int[a.length];
        int mid = a.length/2;
        int[] left = new int[mid];
        System.arraycopy(a,0,left,0,mid);
        int[] right = new int[a.length-mid];
        System.arraycopy(a,mid,right,0,a.length-mid);
        left = mergeSortRecursive(left);
        right = mergeSortRecursive(right);

        //----数据合并----
        int leftIndex=0,rightIndex = 0,tempIndex= 0;
        while (leftIndex <mid && rightIndex< right.length){
            if (left[leftIndex] > right[rightIndex]){
                temp[tempIndex] = right[rightIndex];
                rightIndex++;
            }else {
                temp[tempIndex] = left[leftIndex];
                leftIndex++;
            }
            tempIndex++;
        }
        if (rightIndex<right.length){
            for (int i = rightIndex; i < right.length; i++,tempIndex++) {
                temp[tempIndex] = right[i];
            }
        }
        if (leftIndex<left.length){
            for (int i = leftIndex; i < left.length; i++,tempIndex++) {
                temp[tempIndex] = left[leftIndex];
            }
        }
        return temp;
    }

    public int[] mergeSortInteration(int[] a){
        int len = a.length;
        int[] result = new int[len];
        int block,start;

        for (block =1; block <len*2 ; block*=2) {//子数组的长度
            for (int i = 0; i <len ; i+=2*block) {
                int mid = i+block;
                mid = mid <len ? mid : len;
                int low = i;
                int hight = mid;
                hight = hight >len ? len: hight;
                int hightlen = (i+2*block)>len ? len : (i+2*block);
                int resulti = i;
                while(low<mid && hight<hightlen){
                    result[resulti++] = a[low] < a[hight] ? a[low++] : a[hight++];
                }
                while (low<mid){
                    result[resulti++] = a[low++];
                }

                while(hight<hightlen){
                    result[resulti++] = a[hight++];
                }


            }
            //做深度拷贝
            int[] t = a;
            a = result;
            result = t;
        }
        return a;
    }


}
