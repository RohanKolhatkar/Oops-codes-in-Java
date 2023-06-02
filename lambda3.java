interface calculate{
    int apply(int x, int y);
    
}
// u will have to create a new interface for implementing the new lamba fiunction having different parameters .

interface newinterface{
    int newfunc(int x,int y ,int z);
}

public class lambda3{
    public static void main(String[] args){
        calculate adder = (a,b) -> a+b;
        int r = adder.apply(10,5);
        System.out.println(r);
        // do it yourself
        calculate subtractor = (a,b) -> a-b;
        int s = subtractor.apply(10,5);
        System.out.println(s);
        // calculate multiplier;
        calculate multiplier = (a,b) -> a*b;
        int m = multiplier.apply(10,5);
        System.out.println(m);

        calculate func = (a,b) -> a*b+b*b;
        System.out.println(func.apply(45,45));
         
        newinterface func2 = (a,b,c) -> a+b*c;
        System.out.println(func2.newfunc(12,4,5));

    }
}