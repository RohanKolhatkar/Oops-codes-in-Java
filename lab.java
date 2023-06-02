class timespan {
    public int hours;
    public int minutes;

    timespan(int hours, int minutes){
        this.hours = hours;
        this.minutes= minutes;
    }

    int getHours(){
        return hours;
    }

    int getminutes(){
        return minutes;
    }

    void addhours(int x, int y){
        hours= hours +x;
        minutes = minutes +y;

    }

    void add(timespan tp){
        hours+=tp.hours;
        minutes+= tp.minutes;
    }


    void gettotalhours(){
        System.out.println(hours+"hours"+minutes+"minutes");
    }
    
    public String tostring(){
        String h = " "+ hours+"h"+minutes+"m";
        // System.out.println("h");
        return h;

    }
    

    
}

public class lab {
    public static void main(String[] args){
        timespan object = new timespan(4,8);
        // timespan  = new timespan();

        System.out.println(object.getHours()); // 4
        System.out.println(object.getminutes()); //8
        object.addhours(8,9);
        object.gettotalhours();  //12
        
        System.out.println(object.tostring());

      
        

    }
    
}


