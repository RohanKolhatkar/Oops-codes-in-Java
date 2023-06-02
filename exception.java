
public class exception {
    public static void main(String[] args){
        int array[] = {5,3,6,4,0,2,1};
        try{
            for( int i=0; i<=array.length; i++){
                System.out.println(array[i]/array[i+1]);
                // you will get exception error here
                
            }

        }
        catch(ArithmeticException e){
            System.out.println("cannot divide by zero");
        } // loop will stop once the exception is hitted;

        // check exception2 file for this. how to keep  the loop run after hitting the exception.     
    }    
}
