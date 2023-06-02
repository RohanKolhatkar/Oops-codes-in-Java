

public class book3{
    String title; // properties or fields
    String author;
    book3(String s, String a){ // constructior string s = 
        title = s;
        author =a;
    }
    
    String gettitle(){
        return title;
    }
    public static void main(String[] args){
        book3 x;
        x= new book3("programming in java", "mala gupta");
        x.gettitle();//mmeber operator 
        book3 textbook;
        textbook =x;
        textbook.gettitle();

    //     String titleuppercase= textbook.gettitle();
    }
}