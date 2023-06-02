
// by implementing an interface by  a class you are providing a new a capablities to the class.
//31st march.
interface calculate{
    int apply(int x,int y);
}


// instead of writing all these codes u can simply write a lamba function declared in main class.
// class calc implements calculate{
//     public int apply(int x, int y){
//         int c = x+y;
//         return c;
//     }

// }

public class lambda2 {
    public static void main(String[] args){
        // calculate cal = new calc();
        // calc.apply(3,6);
        
        calculate d2 =(x,y) -> x+y;
        System.out.println(d2.apply(30,50));
    }
    
    
}
