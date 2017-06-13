package SwordToOffer.question;

import java.util.Arrays;

/**
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
 * <<<<<<< Updated upstream
 * 输入一个数组,求出这个数组中的逆序对的总数P。
 * 并将P对1000000007取模的结果输出。
 * 即输出P%1000000007
 * <p>
 * Created by zhiyedan on 17-6-11.
 */
public class InversePairs {
    public static int count = 0;

    public int solution(int[] array) {
        if (array == null || array.length <= -0) {
            return -1;
        }
        mergeSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
        return count;

    }
    public void mergeSort(int [] array,int begin ,int end){
        if(begin<end){
            int mid = (begin+end)>>1;
            mergeSort(array,begin,mid);
            mergeSort(array,mid+1,end);
            merge(array,begin,mid,end);
        }
    }
    public void merge(int [] array,int begin,int mid,int end){
        int [] tempArray = new int [array.length];
        int p1 = begin;
        int p2= mid+1;
        int index = begin;
        while (p1<=mid && p2<=end){
            if(array[p1]>array[p2]){
                tempArray[index++] = array[p2++];
                //TODO 神来之笔啊！！！
                count += mid-p1+1;
                if(count>1000000007){
                    count %= 1000000007;
                }
            }else {
                tempArray[index++] = array[p1++];
            }
        }
        while (p1<=mid){
            tempArray[index++] = array[p1++];
        }
        while (p2<=mid){
            tempArray[index++] = array[p2++];
        }
        for(int i=begin;i<=end;i++){
            array[i] = tempArray[i];
        }
    }

}
