class Base {
    void f(){
        System.out.println("i am from base");
    }
    
}

class Derived extends Base{
    void f(){
        System.out.println("i am from derived");
    }
    void g(){
        System.out.println(" i am too  from derived");
    }
}


public class testbinding{
    public static void main(String[] args){
        Base base = new Base();
        base.f();
        Derived derived = new Derived();
        derived.f();

        //runtime polymorphism
        base = derived; // derived is converted into base type
        base.f();
        base.g(); // you cannot call g here.
        // you will get a error here.


        // dynamic binding.
        derived =base;
        // base have only f while derived has two function f and g.
        //  you  cannot directly convert base into derived but can be done by type casting.
    }
}