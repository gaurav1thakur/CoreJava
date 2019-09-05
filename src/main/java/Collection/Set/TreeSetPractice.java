package Collection.Set;
import java.util.TreeSet;

//Set : Duplicate Not allowed
//Tree Set  -> It will maintain the Ascending order

public class TreeSetPractice {
    public static void main(String[] args) {
        TreeSet<Integer> hs = new TreeSet<Integer>();
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

//Tree Set  -> It will maintain the Ascending order
//        Output
//        11
//        23
//        112
//        123
//        224
//        2233