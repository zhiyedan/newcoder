package SwordToOffer.question;

import java.util.Arrays;

/**
 * int数组，保证奇数在前，偶数在后，相对位置不能变
 * 分析：由于相对位置不变，所以选择稳定排序，冒泡，插入，归并三者中间选择。选择插入排序
 * Created by zhiyedan on 4/20/17.
 */
public class ReOrderArray {
    public void solution(int [] array){
        for(int i=1;i<array.length;i++){
            if(array[i]%2 != 0){
                int temp = array[i];
                int index = i;
                for(int j=i-1;j>=0;j--){
                    if(array[j]%2==0){
                        array[j+1] = array[j];
                        //TODO 关键在于此
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
