import mianjing.question.BiTreeRebuild;
import mianjing.question.Fibonacci;
import mianjing.question.MinNumberInRotateArray;

import java.util.Scanner;

/**
 * Created by zhiyedan on 17-4-16.
 */
public class Main {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.solution(4);
        for(int i=1;i<=40;i++){
            System.out.print(fibonacci.solution(i)+" ");
        }
//        System.out.println(result);
    }
}
