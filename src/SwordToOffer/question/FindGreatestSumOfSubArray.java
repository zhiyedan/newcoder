package SwordToOffer.question;


/**+
 * {6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)
 * 思路：动态规划f(i)表示以array[i]结尾的最大和子数组，如果f(i-1)+array[i]<array[i],则新的子数组从i开始。
 *
 * Created by zhiyedan on 5/16/17.
 */
public class FindGreatestSumOfSubArray {
    public int solution(int [] array){
        if(array==null || array.length==0)
            return 0;
        int max = array[0];
        int tempMax = max;
        for(int i=1;i<array.length;i++) {
            tempMax = Math.max(tempMax+array[i],array[i]);
            max = Math.max(tempMax,max);
        }
        return max;
    }

}
