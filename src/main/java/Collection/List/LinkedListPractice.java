package Collection.List;
import java.util.LinkedList;

//List : Duplicate are allowed
//LinkedList -> It will maintain the insertion order with duplicate values

// Difference between
//           ArrayList | LinkedList
// Searching      Fast | Slow
// Searching is based on index thus Searching is slower in LinkedList we have to traverse each node thus

//           ArrayList | LinkedList
// Insertion      Slow | Fast
// During insertion in array list is updated

//           ArrayList | LinkedList
// Deletion       Slow | Fast
// During insertion in array list is updated using shift down

public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList<Integer> hs = new LinkedList<Integer>();
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

//LinkedList -> It will maintain the insertion order with duplicate values
//        Output
//        23
//        11
//        224
//        11
//        123
//        112
//        112
//        2233
