import mianjing.question.BiTreeRebuild;
import mianjing.question.MinNumberInRotateArray;

import java.util.Scanner;

/**
 * Created by zhiyedan on 17-4-16.
 */
public class Main {
    public static void main(String[] args) {
        MinNumberInRotateArray minNumberInRotateArray = new MinNumberInRotateArray();
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().split(" ");
        int[] nums = new int[strings.length];
        for(int i=0;i<strings.length;i++){
            nums[i] = Integer.parseInt(strings[i]);
        }
        int result = minNumberInRotateArray.findMinNum(nums);
        System.out.println(result);
    }
}
