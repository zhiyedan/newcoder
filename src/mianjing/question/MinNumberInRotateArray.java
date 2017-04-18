package mianjing.question;
/*把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
        输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
        例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1

//TODO 输入String  转化为int[]
Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().split(" ");
        int[] nums = new int[strings.length];
        for(int i=0;i<strings.length;i++){
            nums[i] = Integer.parseInt(strings[i]);
        }
*/
/**
 * Created by zhiyedan on 4/18/17.
 */
public class MinNumberInRotateArray {
    public int findMinNum(int[] array){
        return recursive(array,0,array.length-1);
    }
    public int recursive(int[] array,int begin,int end){
        if(begin == end){
            return array[begin];
        }
        int mid = (begin+end)/2;
        if(array[begin]>array[mid]){
            return recursive(array,begin+1,mid);
        }else if(array[end] < array[mid]){
            return recursive(array,mid+1,end);
        }else{
            return array[begin];
        }
    }
}
