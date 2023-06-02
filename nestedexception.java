public class nestedexception {
    public static void main(String[] args){
        try{
            int a = Integer.parseInt(args[0]); //
            try{
                int b= Integer.parseInt(args[1]);
                System.out.println(a/b);
            }catch(ArithmeticException e){
                System.out.println("div by zero error");

            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("need two parameters ");
        }
    
    
    }
    
}
