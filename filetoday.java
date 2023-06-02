
import java.util.*;

public class filetoday {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>(10);
        list.add("java");
        list.add("python");
        list.add("c++");
        list.add("swift");
        list.add("ruby");
        list.add("c");
        Collections.sort(list);
        // its method and al is arraylist here
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);


        // filetoday obj = new filetoday();

        // System.out.println();
    
    
    }

    
}
