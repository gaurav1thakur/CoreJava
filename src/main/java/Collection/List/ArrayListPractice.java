package Collection.List;
import java.util.ArrayList;

//List : Duplicate are allowed
//Array List  -> It will maintain the insertion order with duplicate values

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> hs = new ArrayList<Integer>();
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

//Array List  -> It will maintain the insertion order with duplicate values
//        Output
//        23
//        11
//        224
//        11
//        123
//        112
//        112
//        2233