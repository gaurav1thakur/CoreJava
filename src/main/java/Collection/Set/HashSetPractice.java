package Collection.Set;
import  java.util.HashSet;

//Set : Duplicate Not allowed
//Hash Set  -> It will not maintain the insertion order

public class HashSetPractice {
    public static void main (String[] args){
        HashSet<Integer> hs = new HashSet<Integer>();
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
        for (Integer i:hs
             ) {
            System.out.println(i);
        }
    }
}
//Hash Set  -> It will not maintain the insertion order
//        Output
//        224
//        112
//        23
//        2233
//        11
//        123