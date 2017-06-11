package basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by zhiyedan on 17-6-11.
 */
public class MergeSort {
    public void sort() {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String [] strings = string.split(" ");
        int [] array = new int [strings.length];
        for(int i=0;i<array.length;i++){
            array[i] = Integer.parseInt(strings[i]);
        }
        System.out.println("the Array is :");
        showArray(array);
        mergeSort(array,0,array.length-1);
        showArray(array);

    }

    public void mergeSort(int[] array, int begin, int end) {
        if (begin < end) {
            int mid = (begin + end) >> 1;
            mergeSort(array, begin, mid);
            mergeSort(array, mid + 1, end);
            merge(array,begin,mid,end);
        }
    }

    public void merge(int[] array, int begin, int mid, int end) {
        int[] temp = new int[array.length];
        int p1 = begin;
        int p2 = mid+1;

        //TODO 注意：这里index并非从0开始，而是从begin开始！！！
        int index = begin;
        while (p1<=mid && p2<=end){
            if(array[p1]<=array[p2]){
                temp[index++] = array[p1++];
            }else {
                temp[index++] = array[p2++];
            }
        }
        //添加剩余数组
        while (p1<=mid){
            temp[index++] = array[p1++];
        }
        while (p2<=end){
            temp[index++] = array[p2++];
        }
        // 复制回原数组
//        array = Arrays.copyOfRange(temp,begin,end+1);
        for(int i=begin;i<=end;i++){
            array[i] = temp[i];
        }
        showArray(array);
    }
    public void showArray(int [] array){
        for(int i:array){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
