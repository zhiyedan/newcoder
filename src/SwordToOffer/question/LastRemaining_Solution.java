package SwordToOffer.question;

/**
 * n个小朋友围一圈，每到m-1,该小朋友出局，从下一个开始，求剩下的最后一个小朋友下标。
 * Created by zhiyedan on 6/20/17.
 */
public class LastRemaining_Solution {
    public int solution(int n, int m) {
        int[] array = new int[n];
        int index = -1;
        int step = 0;
        int count = n;
        while (count>1){
            index++;
            index = index % n;
            if (array[index] == -1)
                continue;
            step++;
            if(step==m){
                step=0;
                array[index] = -1;
                count--;
            }
        }
        for(int i=0;i<n;i++){
            if(array[i]==0)
                return i;
        }
        return index;
    }
}
