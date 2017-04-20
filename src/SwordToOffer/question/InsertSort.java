package SwordToOffer.question;

import java.util.Arrays;

/**
 * Created by zhiyedan on 4/20/17.
 */
//{2,4,6,1,3,5,7}
public class InsertSort {
    public void solution(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                int temp = array[i];
                int index = i;
                for(int j=i-1;j>=0;j--){
                    if(array[j]>temp){
                        array[j+1] = array[j];
                        index = j;
                    }else
                        break;
                }
                array[index] = temp;
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
