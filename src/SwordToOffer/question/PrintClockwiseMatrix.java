package SwordToOffer.question;

import java.util.ArrayList;

/**
 * 顺时针打印回旋矩阵
 * <p>
 * 上行:（i,i）->(i,col-i-1)
 * 右行：（i+1,col-i-1）->(row-i-1,col-i-1)
 * 下行：(row-i-1,col-i-2)->(row-i-1,i)
 * 左行：(row-i-2,i)->(i+1,i)
 * <p>
 * Attention:前提条件是起始行(列)小于等于结束行(列)
 * <p>
 * Created by zhiyedan on 4/24/17.
 */
public class PrintClockwiseMatrix {
    public ArrayList<Integer> solution(int[][] matrix) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
//        有n圈
        int n = (int) Math.ceil((double) Math.min(row, col) / 2);
        for (int i = 0; i < n; i++) {
            //上面一行
            for (int j = i; j <= col - i - 1; j++) {
                arrayList.add(matrix[i][j]);
            }
            //TODO 嵌套进去,如果没有右行，直接结束。 如果不嵌套，输入{{1},{2},{3},{4}},会得到 1,2,3,4,3,2这样错误的结果
            //右侧一行
            if (i + 1 <= row - i - 1) {
                for (int j = i + 1; j <= row - i - 1; j++) {
                    arrayList.add(matrix[j][col - i - 1]);
                }
                //下行
                if (i <= col - i - 2) {
                    for (int j = col - i - 2; j >= i; j--) {
                        arrayList.add(matrix[row - i - 1][j]);
                    }
                    //左行
                    if (i + 1 <= row - i - 2) {
                        for (int j = row - i - 2; j >= i + 1; j--) {
                            arrayList.add(matrix[j][i]);
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
