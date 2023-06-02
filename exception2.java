

public class exception2 {
    public static void main(String[] args){
        int array[] = {5,3,6,4,0,2,1};
        for( int i=0; i<=array.length; i++){
            try{
                System.out.println(array[i]/array[i+1]);
            }  
            // you will get exception error here
            catch(ArithmeticException e){
                System.out.println("cannot divide by zero");
            } 
            // loop will not stop once the exception is hitted;
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("array out of bound" +e);
            }
                
        }

        

        


    
    }    
}
