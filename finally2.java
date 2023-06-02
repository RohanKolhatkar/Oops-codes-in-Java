import java.sql.SQLException;

// succesfully compiled 19/04/2022

public class finally2 {
    static void nestedTry(String args[]) throws  SQLException { 
        try{
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println("div by zero exception");

        }
        finally{ // it will always run
            System.out.println("i will always run / bwe executed");

        }
    }
    public static void main(String args[]){
        try{
            nestedTry(args);

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("need two parameters");
        }
        catch(SQLException e){
            System.out.println("need two parameters");
        }
        catch(ArithmeticException e){
            System.out.println("from the main method: denominator cannot be zero");
        }


    }


}







