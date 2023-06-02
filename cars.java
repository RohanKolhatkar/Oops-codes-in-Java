

public class cars{
    // public static void main(String[] args){
        String car_name;
        String car_colour;
        int car_price;
        int increased_price;
    
        cars(String car_colour, String car_name){
            this.car_name = car_name;
            this.car_colour = car_colour;
    
        }
    
        
        int newprice(){
            return increased_price = car_price + 20000;
    
        }
    
        // actions in class
        String getname(){
            return car_name;
        }
    
        int getprice(){
            return car_price;
        }
    
        void show(){
            System.out.println("car colour is" + car_name);
            System.out.println("car colour is" + car_colour);
        }
    












}


