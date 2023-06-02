import java.util.*;

//13/04/2022
// ho gaya 
class book{
    String author;
    String title;
    int price;
     
    // constructor is there man stay away
    book(String x, String y, int z){
        author = x;
        title = y;
        price = z;
    }
    // getter and setter methods

    int getprice(){
        return price;
    }

    String getauthor(){
        return author;
    }
    
    // setter function
    void setauthor(String x){
        author = x;
    }



}


public class bookissue {
    public static void main(String[] args){
        //new comment
        book obj = new book("rohan", "shame", 134); //directly passing the values to the constructor.
        book obj1 = new book("aditya", "vit", 767); //directly passing the values to the constructor.
        book obj2 = new book("tarun", "trade and trade", 342); //directly passing the values to the constructor.

        // System.out.println("the function get price " + obj.getprice()); // printing the price of the book 
        // System.out.println("the function to print the name of the author " + obj.getauthor()); // printing the name of the author. 
        
        ArrayList<book> arr1 = new ArrayList<book>(10);
        arr1.add(0,obj);
        arr1.add(1,obj1);
        arr1.add(2,obj2);
        arr1.forEach(b -> System.out.println(b)); // you can just write b for book compiler will understand it. // returns the address of the objects.
        arr1.forEach(b -> System.out.println(b.getprice())); // you can just write b for book compiler will understand it.


    
    }
    
}


// topic is sorted collection demo.
//do check this two things vvimp 
// collections.sort(al) // its method and al is arraylist here
// collections.sort(al,collections.reverseorder());
//co