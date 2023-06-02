// import javax.swing.event.SwingPropertyChangeSupport;

class cup {
    // 25-03.2022
    void makecoffee(){
        System.out.println("i am making a coffee");

    }
    
    
}

class capp extends cup{
    void makecoffee(){
        System.out.println("i am making a coffee with latte and foam");
    }
}

public class cupcup{
    public static void main(String[] args){

        cup a = new cup();
        a.makecoffee(); // it will call the cup makecofee function


        capp b = new capp();
        b.makecoffee();
        // this will call the derived class makecoffee function.


    }
}


