package SwordToOffer.question;

/**
 * 请实现一个函数用来匹配包括'.'和'*'的正则表达式。
 * 模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次（包含0次）
 * •如果pttern当前字符和str的当前字符匹配，：有以下三种可能情况
 * （1）pttern当前字符能匹配 str 中的 0 个字符：match(str, pattern+2)
 * （2）pttern当前字符能匹配 str 中的 1 个字符：match(str+1, pattern+2)
 * （3）pttern当前字符能匹配 str 中的 多 个字符：match(str+1, pattern)
 * Created by zhiyedan on 6/21/17.
 */
public class MatchPattern {
    //TODO: 思路，遇到多选择的问题，要想到递归调用，而并非单单的if-else. 循环改成递归，不需要while！
    public boolean solution(char[] str, char[] pattern) {
        if (str == null || pattern == null)
            return false;
        return isMatch(str, pattern, 0, 0);
    }

    public boolean isMatch(char[] str, char[] pattern, int index1, int index2) {
        if (index1 == str.length && index2 == pattern.length)
            return true;
        if (index1 != str.length && index2 == pattern.length)
            return false;
        // to judge the pattern's next char is '*' or not
        if (index2 + 1 < pattern.length && pattern[index2 + 1] == '*') {
            // TODO:java array 时候都要在用之间判断是否数组越界！！！
            // match
            if (index1 != str.length && (str[index1] == pattern[index2] || pattern[index2] == '.')) {
                return (isMatch(str, pattern, index1, index2 + 2)
                        || isMatch(str, pattern, index1 + 1, index2)
                        || isMatch(str, pattern, index1 + 1, index2 + 2));
            }
            // not match
            else {
                return isMatch(str, pattern, index1, index2 + 2);
            }

        } else {
            if (index1 < str.length && (str[index1] == pattern[index2] || pattern[index2] == '.'))
                return isMatch(str, pattern, index1 + 1, index2 + 1);
            return false;
        }
    }
}
