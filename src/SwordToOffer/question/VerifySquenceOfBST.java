package SwordToOffer.question;

/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果
 *
 * Created by zhiyedan on 4/26/17.
 */
public class VerifySquenceOfBST {
    public boolean solution(int [] sequence) {
        if(sequence.length==0)
            return false;
        return recursive(sequence,0,sequence.length-1);
    }
    public boolean recursive1(int [] array,int begin,int end){
        if(end-begin<=1)
            return true;
        int tailVal = array[end];
        // index 为大于参考值的第一个元素下标
        int index = -1;
        for(int i=begin;i<end;i++){
            if(array[i]>tailVal){
                index=i;
                break;
            }
        }
        if(index == -1){
            return recursive(array,begin,end-1);
        }
        else{
            for(int i=index+1;i<end;i++){
                if(array[i]<tailVal)
                    return false;
            }
            if(index == begin)
                return recursive(array,begin,end-1);
            return recursive(array,begin,index-1) && recursive(array,index,end-1);
        }

    }
    // 改进版本
    public boolean recursive(int [] array,int begin,int end){
        if(end-begin<=1)
            return true;
        int index=begin;
        //TODO 简化了找index的代码 注意：index<end 必不可少！否则进入死循环
        while(array[index++]<array[end] && index<end);
        for(int j=index;j<end;j++){
            if(array[j]<array[end])
                return false;
        }
        return recursive(array,begin,index-1) && recursive(array,index,end-1);
    }
}
