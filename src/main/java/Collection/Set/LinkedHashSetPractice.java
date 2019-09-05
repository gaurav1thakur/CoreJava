package Collection.Set;
import java.util.LinkedHashSet;

//Set : Duplicate Not allowed
//Linked Hash Set  -> It will maintain the insertion order

public class LinkedHashSetPractice {
    public static void main(String[] args) {
        LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
        hs.add(23);
        hs.add(11);
        hs.add(224);
        hs.add(11);
        hs.add(123);
        hs.add(112);
        hs.add(112);
        hs.add(2233);
        //foreach loop - advanced loop
        //get integer and print all
        for (Integer i : hs
        ) {
            System.out.println(i);
        }
    }
}
//Linked Hash Set  -> It will maintain the insertion order
//        Output
//        23
//        11
//        224
//        123
//        112
//        2233