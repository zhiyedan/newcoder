package mianjing.question;

/**
 * Created by zhiyedan on 4/18/17.
 */
public class MinNumberInRotateArray {
    public int findMinNum(int[] array){
        return recursive(array,0,array.length-1);
    }
    public int recursive(int[] array,int begin,int end){
        if(begin == end){
            return array[begin];
        }
        int mid = (begin+end)/2;
        if(array[begin]>array[mid]){
            return recursive(array,begin+1,mid);
        }else if(array[end] < array[mid]){
            return recursive(array,mid+1,end);
        }else{
            return array[begin];
        }
    }
}
