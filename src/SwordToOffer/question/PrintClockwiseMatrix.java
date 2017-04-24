package SwordToOffer.question;

import java.util.ArrayList;

/**
 * 顺时针打印回旋矩阵
 * Created by zhiyedan on 4/24/17.
 */
public class PrintClockwiseMatrix {
    public ArrayList<Integer> solution(int [][] matrix) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
//        有n圈
        int n = (int) Math.ceil((double) Math.min(row,col)/2);
        for(int i=0;i<n;i++){
            //上面一行
            for(int j=i;j<row-i;j++){
                arrayList.add(matrix[i][j]);
            }
            //右侧一行,输出的前提是起始行大于终止行

        }
        return  arrayList;
    }
}
