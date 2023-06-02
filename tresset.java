import java.util.*;
// import java.util.SortedSet;
// import java.util.ArrayList;
// 12/04/2022


public class tresset {
    public static void main(String[] args){
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        System.out.println("treeset" + numbers);
        System.out.println("using higher "+ numbers.higher(3)); // return the higher available in the treeset number than the passed number.
        System.out.println("using lower "+ numbers.lower(4)); //returns the loswest number than the passed number
        System.out.println("using ceiling "+ numbers.ceiling(4)); //greater than or equal to x.
        System.out.println("using floor "+ numbers.floor(4)); // less than or equal to x;
        System.out.println("removed first element "+ numbers.pollFirst()); // return/removes  the first value tree
        System.out.println("removed last element "+ numbers.pollLast()); //return/removes the last value of the tree
        System.out.println("using headset without boolean value" + numbers.headSet(5)); // returns the lesser element
        System.out.println("using headset with boolean value" + numbers.headSet(5,true)); // returns the lesser element
        System.out.println("using tailset with boolean value" + numbers.tailSet(6,true)); // in true 6 is included.
        System.out.println("using subset without boolean value" + numbers.subSet(8,10));
        System.out.println("using subset without boolean value" + numbers.subSet(4,false,6,true));
        // System.out.println("removed last element "+ numbers.pollLast());
    
    
    }
    
}









