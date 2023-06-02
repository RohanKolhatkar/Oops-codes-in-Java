
import java.util.*;
public class arraylist {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        list.add(5);
        list.add(8);
        list.add(3);
        list.add(11);
        list.add(5);
        list.add(3);
        int n = list.size();
        for(int i=0; i<n;i++){
            if(list[i]>5){
                System.out.println(list[i]);                
            }
        }
    
    
    }
}


