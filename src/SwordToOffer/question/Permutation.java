package SwordToOffer.question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * <p>
 * Created by zhiyedan on 17-5-10.
 */
public class Permutation {
    public ArrayList<String> soulution(String str) {
        ArrayList<String> result = new ArrayList<>();
        if (str.length() == 0 || str == null) {
            return result;
        }
        recursive(str.toCharArray(), 0, result);
        Collections.sort(result);
        return result;
    }

    public void recursive(char[] chars, int begin, ArrayList<String> result) {
        if (begin == chars.length - 1) {
            //字符数组转字符串            result.add(chars.toString());
            result.add(new String(chars));
            return;
        }
        HashSet<Character> set = new HashSet<>();
        for (int i = begin; i < chars.length; ++i) {
            if (i == begin || !set.contains(chars[i])) {
                set.add(chars[i]);
                swap(chars, i, begin);
                recursive(chars, begin + 1, result);
                swap(chars, i, begin);
            }
        }

    }

    public void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
