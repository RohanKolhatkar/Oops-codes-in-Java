public class TestBinding {
    void f(){
        System.out.println("i am from base");
    }
    
}


class Derived{
    void f(){
        System.out.println("i am from derived");
    }
}


public class testbinding{
    public static void main(String[] args){
        TestBinding base = new TestBinding();
        base.f();
        Derived derived = new Derived();
        derived.f();
    }
}



