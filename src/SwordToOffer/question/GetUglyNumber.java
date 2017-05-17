package SwordToOffer.question;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 把只包含因子2、3和5的数称作丑数（Ugly Number）。
 * 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 * Created by zhiyedan on 5/17/17.
 */
public class GetUglyNumber {
    //网上最佳答案，很巧妙！！
    public int solution(int index){
        if(index<1)
            return 0;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        //TODO 多个变量的初始化
        int t2=0,t3=0,t5=0;
        while (list.size()<index){
            int min = Math.min(list.get(t2)*2,Math.min(list.get(t3)*3,list.get(t5)*5));
            list.add(min);
            if(min==list.get(t2)*2)
                t2++;
            if(min==list.get(t3)*3)
                t3++;
            if(min==list.get(t5)*5)
                t5++;
        }
        return list.get(index-1);
    }
    public int solution1(int index) {
        if (index < 1)
            return 0;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i = 1; i < index; i++) {
            ArrayList<Integer> tempList = new ArrayList<>();
            for (int num : list) {
                tempList.add(num * 2);
                tempList.add(num * 3);
                tempList.add(num * 5);
            }
            Collections.sort(tempList);
            int tail = list.get(list.size() - 1);
            for (int num : tempList) {
                if (num > tail) {
                    list.add(num);
                    break;
                }
            }
        }
        return list.get(list.size() - 1);
    }

    public int solution3(int index) {
        if(index<1)
            return 0;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        int count = 1;
        int listindex = 0;
        while (count < index*5) {
            int curNum = list.get(listindex);
            if (!list.contains(curNum * 2))
                list.add(curNum * 2);
            if (!list.contains(curNum * 3))
                list.add(curNum * 3);
            if (!list.contains(curNum * 5))
                list.add(curNum * 5);
            count = list.size();
            Collections.sort(list);
            listindex++;
        }
        return list.get(index - 1);
    }


}
