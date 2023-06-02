// abstract class provide half exxtraction.
abstract class shape{
    // we can not create objects from abstract classes.
    int color;
    abstract int calculatearea();

    // concreate methods
    void fillcolor(){
        System.out.println("filled with brown");
    }
    shape(){
        color =100;
    }

}




// public class square {
//     // int side;
//     int calculatearea(){
//         return side*side;
//     }
    // int side;// here also you can define side instead of doing above.

    
// }

class square extends shape{
    int calculatearea(){
        return side*side;
    }
    int side;
}
