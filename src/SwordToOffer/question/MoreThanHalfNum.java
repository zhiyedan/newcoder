package SwordToOffer.question;

import java.util.HashMap;
import java.util.Map;

/**
 *
 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。
 如果不存在则输出0
 * Created by zhiyedan on 5/15/17.
 */
public class MoreThanHalfNum {
    public int solution(int [] array){
        //TODO a>>1+1 先执行 1+1！！！
        int threshold = (array.length)>>1;
        int result = 0;
        //TODO 数据类型：Integer 不能用int 代替
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:array){
            int temp=1;
            if(map.containsKey(i)){
                temp = map.get(i)+1;
                map.put(i,temp);
            }else{
                map.put(i,temp);
            }
            if(temp>threshold)
                return i;
        }
        /*for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>threshold){
                result = entry.getKey();
                break;
            }
        }*/
        return result;
    }
    //打擂台解法：超过一半为point
    public int solution2(int [] array){
        int winner = array[0];
        int count = 1;
        for(int i=1;i<array.length;i++){
            if(count==0){
                winner = array[i];
                count = 1;
            }else {
                if(array[i] == winner){
                    count++;
                }else {
                    count--;
                }
            }
        }
        //winner 为擂主（有可能为假擂主）
        count = 0;
        for(int i=0;i<array.length;i++){
            if(array[i] == winner)
                count++;
        }
        return count*2>array.length?winner:0;
    }
}
