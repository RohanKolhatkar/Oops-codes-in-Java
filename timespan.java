
public class TimeSpan{
    public static void main(String[] args){
    private int myHours;

    private int myMinutes;

   

    public TimeSpan(int hours, int minutes){

    public void add(int hours, int minutes) {

        this.myHours = hours;

        this.myMinutes = minutes;

    }

    public int getHours() {

        return this.myHours = hours;

    }

    public int getMinutes() {

        return this.myMinutes = minutes;

    }

    public void add(TimeSpan rhs)

    {

        hours += rhs.hours;

        minutes += rhs.minutes;

        hours += minutes/60;

        minutes = minutes%60;

    }

    }
    }
    

}