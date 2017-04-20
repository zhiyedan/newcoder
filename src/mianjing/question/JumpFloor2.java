package mianjing.question;

/**
 * Created by zhiyedan on 4/20/17.
 */
public class JumpFloor2 {
    public int solution(int n) {
        if (n <= 2)
            return n;
        //TODO 注意：这里new的int的大小为n+1,并非n！！！
        int[] array = new int[n+1];
        array[1] = 1;
        array[2] = 2;
        for (int i = 3; i <= n; i++) {
            for (int j = i - 1; j >= 1; j--) {
                array[i] += array[j];
            }
            array[i] += 1;
        }
        return array[n];
    }
}
