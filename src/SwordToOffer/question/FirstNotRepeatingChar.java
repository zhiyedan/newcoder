package SwordToOffer.question;


/**
 * 在一个字符串(1<=字符串长度<=10000，全部由大写字母组成)中找到第一个只出现一次的字符,并返回它的位置
 * Created by zhiyedan on 5/17/17.
 */
public class FirstNotRepeatingChar {
    public int solution(String str) {
        if(str==null||str.length()==0)
            return -1;
        int index = 0;
        int [] array = new int[118];
        char [] chars = str.toCharArray();
        for(char ch : chars){
            array[ch-'A']++;
        }
        for(int i=0;i<chars.length;i++){
            if(array[chars[i]-'A']==1){
                index = i;
                break;
            }
        }
        return index;
    }
}
