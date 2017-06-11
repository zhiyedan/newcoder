package otherQuestion;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 俗称：爬山
 * 三张牌，豹子>顺子>对子
 * 输入：两个字符串
 * 输出：1：左边玩家赢，
 * 0：平局，
 * -1：右边玩家赢，
 * -2：输入不合法
 * Created by zhiyedan on 17-6-6.
 */
public class Climb {
    public static final char[] CHARS = {'2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K', 'A'};

   /* public static int solution() {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next().replace("10", "T").toUpperCase();
        String s2 = scanner.next().replace("10", "T").toUpperCase();
        if (!isValid(s1) || !isValid(s2))
            return -2;
        if(s1.equals(s2))
            return 0;

    }

    //检验输入的合法性
    public static boolean isValid(String string) {
//        string = string.replace("10", "T").toUpperCase();
        if (string.length() != 3)
            return false;
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (Arrays.binarySearch(CHARS, c) < 0)
                return false;
        }
        return true;
    }*/
}
