interface liveable{
    void live();
}


class human implements liveable{
    public void live(){
        System.out.println("i live by exploting othe humans");
    }
}
class animal implements liveable{
    public void live(){
        System.out.println("i live by exploting othe humans");
    }
}

class interfacedemo{
    public static void main(String[] args){
        human man = new human();
        man.live();
        animal dog= new animal();
        dog.live();
        liveable cat = new animal();
        cat.live();
    }
}






// public class jdjs {
    
// }
