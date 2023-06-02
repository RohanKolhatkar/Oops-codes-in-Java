// succesfully compiled 19/04/2022

public class nestedexceptipn2{
    static void nestedTry(String args[]){
        try{
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println("div by zero exception");

        }
    }
    public static void main(String args[]){
        try{
            nestedTry(args);

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("need two parameters");
        }


    }


}







