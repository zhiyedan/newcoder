package SwordToOffer.question;

/**
 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
 * 例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。
 * 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
 * <p>
 * Created by zhiyedan on 6/26/17.
 */
public class IsNumeric {
    public boolean solution2(char[] str){
        String string = new String(str);
        // TODO 字符串匹配，符号前面的双斜杠一定要加！！！否则运行结果出错
        return string.matches("[\\+-]?[0-9]*(\\.[0-9]*)?([eE][\\+-]?[0-9]+)?");
    }
    public boolean solution(char[] str) {
        if (str == null || str.length == 0)
            return false;
        for (int i = 0; i < str.length; i++) {
            char ch = str[i];
            if (!(ch == '+' || ch == '-' || ch == 'e' || ch == 'E' || ch == '.' || (ch >= 48 && ch <= 57)))
                return false;
            switch (ch) {
                case '+':
                case '-':
                    if (!case1(str, i))
                        return false;
                    break;
                case 'e':
                case 'E':
                    if (!case2(str, i))
                        return false;
                    break;
                case '.':
                    if (!case3(str, i))
                        return false;
                    break;
                default:
                    break;
            }
        }
        return true;
    }

    private boolean case1(char[] str, int i) {
        if (i!=str.length-1 && (i == 0 || str[i - 1] == 'e' || str[i - 1] == 'E'))
            return true;
        return false;
    }

    private boolean case2(char[] str, int i) {
        //unique and there is no '.' in the behind
        for(int index = i+1;index<str.length;index++){
            if(str[index]=='e' || str[index]=='E' || str[index]=='.')
                return false;
        }
        if(i==0 || i== str.length-1)
            return false;
        return true;
    }

    private boolean case3(char[] str, int i) {
        //unique
        for(int index = i+1;index<str.length;index++){
            if(str[index]=='.')
                return false;
        }
        //前后均为数字
        if(i-1>=0 &&(str[i-1]=='+'||str[i-1]=='-' || str[i-1]<=57 && str[i-1] >=48) && i+1<str.length && str[i+1]<=57 && str[i+1] >=48)
            return true;
        return false;
    }

}
