import java.util.*;


public class hashmap {
    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<>();

        map.put("rohan" ,1);
        map.put("amit",4);
        map.put("trilok",6);
        map.put("aditya",8);
        map.put("dhruv",10);

        //tresting if the map contains the key.
        System.out.println(map.containsKey("rohan"));
        System.out.println(map.containsValue(7));

        // removing the key value pair and returning the value
        System.out.println(map.remove("dhruv"));
        System.out.println(map.remove("dhruv")); // null
        System.out.println(map);
        
        Set<Map.Entry<String, Integer>>entries= map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();


        while(iterator.hasNext()){
            // System.out.println(iterator.next().getKey()); //to get keys
            // System.out.println(iterator.next().getValue());


            Map.Entry<String,Integer> entry = iterator.next();
            System.out.println(entry);

            String name = entry.getKey();
            int value = entry.getValue();
            System.out.println(value +"     " + name);




        }
        
    }
}
















