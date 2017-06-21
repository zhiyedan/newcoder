package SwordToOffer.question;

import java.util.Stack;

/**
 * 将一个字符串转换成一个整数
 * input:输入一个字符串,包括数字字母符号,可以为空
 * output:如果是合法的数值表达则返回该数字，否则返回0
 * +2147483647 --> 2147483647
 *
 * good point 也可以正向计算： sum = sum*10 + (char-48)
 * Created by zhiyedan on 6/21/17.
 */
public class StrToInt {
    public int solution(String str) {
        //判断第一个符号
        int count= 0;
        int result = 0;
        boolean isPositive = true;
        Stack<Integer> stack = new Stack<>();
        char firstChar = str.charAt(0);
        if(firstChar<58 && firstChar>48){
            stack.push(firstChar-48);
            count++;
        }else if(firstChar=='-'){
            isPositive = false;
        }else if(firstChar=='+'){
            isPositive = true;
        }
        else {
            return 0;
        }
        //遍历余下的每一个字符
        for (int i=1;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch<48 || ch>57)
                return 0;
            stack.push(ch-48);
            count++;
        }
        //整合输出
        if(stack.empty())
            return 0;
        int base = 1;
        while (!stack.empty()){
            result += stack.pop()*base;
            base *= 10;
        }
        return (isPositive)?result:-result;
    }


}
