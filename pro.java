import java.util.*;

class purchase{
    int itemcode;
    String itemtype;
    int price;
    int quantity;
    String typeofpurchase;

    //constructor  
    purchase(int x, String y, int z, int k, String m){
        itemcode =x;
        itemtype = y;
        price =z;
        quantity =k;
        typeofpurchase = m;
        //this is new [urchase]
    }

    //example of setter methods
    void setitemcode(int itemcode){
        this.itemcode = itemcode;

    }
    
    void setprice(int price){
        this.price = price;

    }

    //getter methods example
    int getitemcode(){
        return itemcode;
    }


    void tostring(){
        //just an example of  tostring method
        System.out.println("the details are"+ itemcode+ " " + itemtype+ " " + price+ " " );
    }

}


public class pro {
    public static void main(String[] args){
        List<purchase> studlist = new ArrayList<purchase>();
        studlist.add(new purchase(123, "cosemetics", 400, 2, "credit"));
        studlist.add(new purchase(433, "electronicd", 5800, 2, "credit");
        studlist.add(new purchase(125, "medicine", 5000, 2, "debit"));
        studlist.add(new purchase(125, "medicine", 400, 2, "debit"));

        
        
        // list<obj> = new list<obj>();
        // Display the item code whose price is greater than X (you can assume your own price) and is purchased in debit

        stream.filter(pricee -> price.greaterthan(3000).forEach(System.out::println);
        // Partition the list of purchases into Credit and Debit and display the credit purchases only

        stream.filter(itemtype -> itemtype."credit".forEach(System.out::println);
        
        // (c)	Group the purchases based on the item type in the sorted order of their price and then quantity
        
        Map<String, List<purchase>> pur = pur.stream().collect(Collectors.groupingBy(w-> w.price));

    }

}













