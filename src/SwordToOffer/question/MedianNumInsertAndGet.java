package SwordToOffer.question;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
 * 如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。
 *
 * 思路：
 * 1、两个堆中的数据数目差不能超过1，这样可以使中位数只会出现在两个堆的交接处；
 * 2、大顶堆的所有数据都小于小顶堆，这样就满足了排序要求。
 * Created by zhiyedan on 6/28/17.
 */
public class MedianNumInsertAndGet {
    int count=0;
    //默认小顶堆
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    //自定义比较器
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(11,new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    });
    /**
     * 第奇数个数据插入到大顶堆，偶数插入到小顶堆。这样保证两者的平衡性。
     * @param num
     */
    public void insert(int num){
        count++;
        //TODO 判断奇偶的高效方法
        if((count & 1) == 0){
            //第偶数个，放入小顶堆，但不一定是num插入到小顶堆
            if(!maxHeap.isEmpty() && maxHeap.peek()>num){
                maxHeap.offer(num);
                num = maxHeap.poll();
            }
            minHeap.offer(num);
        }else {
            if(!minHeap.isEmpty() && minHeap.peek()<num){
                minHeap.offer(num);
                num = minHeap.poll();
            }
            maxHeap.offer(num);
        }
    }

    public Double getMedian(){
        if(count==0)
            throw new RuntimeException("no number");
        if((count & 1)==1)
            return (double)maxHeap.peek();
        //TODO: int->double 2->2.0
        return (minHeap.peek()+maxHeap.peek())/2.0;
    }

}
