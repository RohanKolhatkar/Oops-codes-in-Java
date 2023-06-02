//28/03
//static and instance
final class fruit{ // if we use final here then rotten fruit class cannot be made 
    final String name = "mango";
    final void f(){
        System.out.println(" no derived class can modify me");
    }
    fruit(){

    }
    public static void main(String[] args){
        fruit f= new fruit();
        f.name = "apple"; //  will give error  static cannot be over written 
    }
}


class rotten extends fruit{ // we cannot inherit the class that is final it cannotbe further extended.
    void f(){
        System.out.println(" i wont get compiled");

    }
}






