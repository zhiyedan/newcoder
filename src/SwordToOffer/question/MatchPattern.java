package SwordToOffer.question;

/**
 * Created by zhiyedan on 6/21/17.
 */
public class MatchPattern {
    public boolean solution(char[] str, char[] pattern) {
        boolean result = false;
        int index1 = 0;
        int index2 = 0;
        while (index1<str.length && index2<pattern.length){
            // to judge the pattern's next char is '*' or not
            if(index2+1<pattern.length && pattern[index2+1]=='*'){

            }
        }

        return result;
    }
}
