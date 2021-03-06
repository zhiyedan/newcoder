package SwordToOffer.question;

import java.util.Arrays;
import java.util.Stack;

/**
 * 第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序
 * 例如序列1,2,3,4,5是某栈的压入顺序，
 * 序列4，5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列
 * Created by zhiyedan on 4/25/17.
 *
 * 思路1：新建数组，存放状态，0表示该数字还未入栈，1表示入栈，2表示已经出战。
 * 网上打思路是错误打。。。
 */
public class IsPopOrder {
    //添加辅助stack
    public boolean solution(int [] pushA,int [] popA){
        Stack<Integer> stack = new Stack();
        if(pushA.length==0 || popA.length==0)
            return false;
        int j=0;
        for(int i=0;i<popA.length;i++){
            stack.push(pushA[i]);
            while(j<popA.length && stack.peek()==popA[j]){
                stack.pop();
                j++;
            }
        }
        return stack.empty()? true : false;
    }
    public boolean solution1(int [] pushA,int [] popA){
        boolean flag = true;
        int num = pushA.length;
        int[] array = new int[num];
        for(int i:popA){
            int index = Arrays.binarySearch(pushA,i);
            if(index<0)
                return false;
            //判断后面是否有1,有则直接返回false
            if(Arrays.binarySearch(array,index+1,num,1)>=0){
                return false;
            }
            array[index] = 2;
            replace0with1(array,index);
        }
        return flag;
    }
    public void replace0with1(int [] array,int index){
        for(int i=0;i<index;i++){
            if(array[i]==0)
                array[i] = 1;
        }
    }
}
