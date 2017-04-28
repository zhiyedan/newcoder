import SwordToOffer.question.*;
import SwordToOffer.resc.ListNode;
import SwordToOffer.resc.TreeNode;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by zhiyedan on 17-4-16.
 */
public class Main {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        f(arrayList);
        f(arrayList);
        System.out.println(arrayList.toString());
    }
    public static void f(ArrayList<Integer> arrayList){
        ArrayList<Integer> re = new ArrayList<>(arrayList);
//        Collections.copy(re,arrayList);
//        re.clone(arrayList);
        re.add(2);
    }
}
