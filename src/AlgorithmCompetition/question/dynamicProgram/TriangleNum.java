package AlgorithmCompetition.question.dynamicProgram;


/**
 * Created by zhiyedan on 4/19/17.
 * 三角形，除了最下行之外，其他每行的每个数字左下和右下各有一个数字。 存放二位数组a[n][n]; 非负整数！
 * 问题：从第一行走到最后一行，所走路径的数字最大和
 */
public class TriangleNum {
    int n = 0;
    int[][] a = new int[n+1][n+1];
    int[][] d = new int[n+1][n+1];
    //递归,重复计算太多
    int solve(int i, int j) {
        return a[i][j] + (i == n ? 0:Math.max(solve(i + 1, j), solve(i + 1, j + 1)));
    }
    //递推：从底向上计算
    int solve2(){
        int[][] result = a;
        //先处理最后一行
        for(int i=1;i<=n;i++){
            d[n][i] = a[n][i];
        }
        //从下向上计算
        for(int i=n-1;i>0;i++){
            for(int j=1;j<=i;j++){
                d[i][j] = a[i][j] + Math.max(d[i+1][j],d[i+1][j+1]);
            }
        }
        return d[1][1];
    }
    //记忆化搜素,先将d[][]初始化为-1
    int solve3(int i,int j){
        if(d[i][j]!=-1){
            return d[i][j];
        }
        return d[i][j] = a[i][j] + (i==n?0:Math.max(solve3(i+1,j),solve3(i+1,j+1)));
    }
}
