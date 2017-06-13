package SwordToOffer.question;

/**
 * 统计一个数字在排序数组中出现的次数
 * 思路：重在思考！看到有序数组，肯定要在第一时间想到二分查找。
 * 思路一：找到midIndex，然后左右遍历查找，适合于重复数据不多的数据集。
 * 思路二：直接改写二分查找，先找到leftIndex,再找到rightIndex，两者均不为-1.
 * Attention：并不一定局限于递归。可以用循环做。
 * Created by zhiyedan on 6/13/17.
 */
public class GetNumberOfK {
    private int leftIndex = 0;
    private int rightIndex;

    public int solution(int[] array, int k) {
        int count = 0;
        rightIndex = array.length - 1;
        int midIndex = biSearch(array, k, 0, array.length - 1);
        if (midIndex == -1) {
            return count;
        }
        System.out.println("midIndex is :" + midIndex);
        int leftboard = findLeftBoard(array, k, leftIndex, midIndex);
        System.out.println("left borad index is :" + leftboard);
        int rightboard = findRightBoard(array, k, midIndex, rightIndex);
        System.out.println("right borad index is :" + rightboard);
        count = rightboard - leftboard + 1;
        return count;
    }

    public int biSearch(int[] array, int k, int begin, int end) {
        if (begin > end || begin < 0 || end >= array.length) {
            return -1;
        }
        int mid = (begin + end) >> 1;
        if (array[mid] == k) {
            return mid;
        } else if (array[mid] < k) {
            leftIndex = mid;
            return biSearch(array, k, mid + 1, end);
        } else {
            rightIndex = mid;
            return biSearch(array, k, begin, mid - 1);
        }
    }

    public int findLeftBoard(int[] array, int k, int begin, int end) {
        if (end <= 0 || array[end - 1] != array[end])
            return end;
        if (array[begin] == array[end])
            return begin;
        int mid = (begin + end) >> 1;
        if (array[mid] == k) {
            return findLeftBoard(array, k, begin, mid);
        } else {
            return findLeftBoard(array, k, mid + 1, end);
        }
    }

    public int findRightBoard(int[] array, int k, int begin, int end) {
        if (begin >= end || array[begin + 1] != array[begin]) {
            return begin;
        }
        if (array[begin] == array[end])
            return end;
        int mid = (begin + end) >> 1;
        if (array[mid] == k) {
            return findRightBoard(array, k, mid, end);
        } else {
            return findRightBoard(array, k, begin, mid - 1);
        }
    }

    public int solution2(int[] array, int k) {
        int leftboard = leftSearch(array, k, 0, array.length - 1);
        System.out.println("left borad index is :" + leftboard);
        if (leftboard == -1)
            return 0;
        int rightboard = rightSearch(array, k, 0, array.length - 1);
        System.out.println("right borad index is :" + rightboard);
        return (rightboard - leftboard + 1);
    }

    private int rightSearch(int[] array, int k, int begin, int end) {
        //TODO 平时很少写循环,当作练习
        if (begin > end)
            return -1;
        int mid = (begin+end)>>1;
        while (begin<=end){
            if(array[mid]>k){
                end = mid-1;
            }else if(array[mid]<k){
                begin = mid+1;
            }else if(mid+1<=end && array[mid+1]==k){
                begin = mid+1;
            }else {
                return mid;
            }
            mid = (begin+end)>>1;
        }
        return -1;
    }

    public int leftSearch(int[] array, int k, int begin, int end) {
        //大同小异
        return -1;
    }

}
