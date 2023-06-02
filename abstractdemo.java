// class 28/03 monday .
abstract class base{
    abstract void f();
}
 class derived extends base{
      void f(){
          System.out.println("simple example of abstract method implementation");
      }
 }


public class abstractdemo {
    // class 28/03
    public static void main(String[] args){
        // base bobj = new base(); //  this wont compile 
        derived d = new derived();
        d.f();
    }
    
}


// questions can be made up of scenario based;
// 
