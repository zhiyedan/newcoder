package SwordToOffer.question;

/**
 * 不用除法
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
 * Created by zhiyedan on 6/21/17.
 */
public class Multiply {
    public int[] solution(int[] A){
        int len = A.length;
        int[] b = new int[len];
        b[0] = 1;
        //计算下三角
        for(int i=1;i<len;i++){
            b[i] = b[i-1]*A[i-1];
        }
        //计算上三角
        int temp = 1;
        for(int i=len-2;i>0;i--){
            temp *= A[i+1];
            b[i] *= temp;
        }
        return b;
    }
}
