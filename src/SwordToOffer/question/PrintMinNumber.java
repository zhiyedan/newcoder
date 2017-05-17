package SwordToOffer.question;

/**
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323
 * <p>
 * Created by zhiyedan on 5/17/17.
 */
public class PrintMinNumber {
    public String solution(int[] numbers) {
        String[] array = new String[numbers.length];
        for (int i = 0; i < array.length; i++) {
            //TODO int transfer to string
            array[i] = Integer.toString(numbers[i]);
        }
        quickSort(array,0,array.length-1);
        String result = "";
        for(String s:array){
            result += s;
        }
        return result;
    }

    public void quickSort(String[] array, int begin, int end) {
        //TODO: 这里的判断应该为if而非while！！！ while容易陷入死循环
        if (begin < end) {
            int mid = partation(array, begin, end);
            quickSort(array,begin,mid-1);
            quickSort(array,mid+1,end);
        }
    }

    public int partation(String[] array, int begin, int end) {
        String refeValue = array[end];
        while (begin < end) {
            while (begin < end && stringComparator(array[begin], refeValue) <= 0) {
                begin++;
            }
            array[end] = array[begin];
            while (begin < end && stringComparator(array[end], refeValue) >= 0) {
                end--;
            }
            array[begin] = array[end];
        }
        array[end] = refeValue;
        return end;
    }

    //a<b 返回值为负数
    public int stringComparator(String a, String b) {
        int result = 0;
        int aLen = a.length();
        int bLen = b.length();
        if (aLen == bLen) {
            return a.compareTo(b);
        } else if (aLen < bLen) {
            String tempString = b.substring(0, aLen);
            int tempResult = a.compareTo(tempString);
            if (tempResult != 0)
                return tempResult;
            return stringComparator(a, b.substring(aLen, bLen));
        } else {
            String tempString = a.substring(0, bLen);
            int tempResult = tempString.compareTo(b);
            if (tempResult != 0)
                return tempResult;
            return stringComparator(a.substring(bLen, aLen), b);
        }
    }
}
