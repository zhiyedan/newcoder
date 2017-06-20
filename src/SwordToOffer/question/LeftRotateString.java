package SwordToOffer.question;

/**
 * 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出
 *
 * Created by zhiyedan on 6/20/17.
 */
public class LeftRotateString {
    public String solution(String str,int n) {
        if(str==null || str.length()==0 || n<0)
            return null;
        String temp = str.concat(str);
        n = n % str.length();
        return temp.substring(n,n+str.length());
    }
    //循环右移
//    return temp.substring(str.length()-n,2*str.length()-n);
}
