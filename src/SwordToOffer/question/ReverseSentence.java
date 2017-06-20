package SwordToOffer.question;

/**
 * “student. a am I” 反转为 “I am a student.”
 * Created by zhiyedan on 6/20/17.
 */
public class ReverseSentence {
    public String solution(String str) {
        System.out.println("str.len is :"+str.length());
        String[] strings = str.split(" ");
        if(strings.length==0)
            return str;
        String result = "";
        for(int i=strings.length-1;i>=0;i--){
            result += strings[i]+" ";
        }
        return result.substring(0,str.length());
    }
}
