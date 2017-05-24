package Moock.Sort;

import com.alibaba.fastjson.JSONArray;

/**
 * Created by junshuaizhang1 on 2017/5/23.
 * 排序包内的公用方法父类
 */
public class SortCommon {

    /**
     * 交换数组
     * @param a
     * @param i
     * @param j
     */
    public static void  swap(int[] a,int i,int j){
//        System.out.println(i+"与"+j+"交换"+ JSONArray.toJSONString(a));
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
