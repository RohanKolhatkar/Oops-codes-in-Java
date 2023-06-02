class car{

    static int count;
    String model;
    car(){
        count++;
    }

    car(String model){
        this.model = model;
        count++;
    }

    static{
        count = 20000;
    }

    static int getcount(){
        // System.out.println(model);
        return count;
        

    }
}





public class staticdemo {
    public static void main(String[] args){
        car c;
        for(int i=1; i<=30; i++){
            c = new car();
        System.out.println("total cars created is " + car.count);    

        }



    }
    
}
