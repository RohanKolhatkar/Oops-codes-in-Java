class student{
    public String name;
    public int id;
    public int gpa;
    
    void Student(String name, int id, int gpa ){
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }


    public String getname(){
        return name;
    }
    public int getid(){
        return id;
    }
    public int getgpa(){
        return gpa;
    }

    void setname(String newname){
        name = newname;

    }
    // String tostring(){
    //     string s = ""+"the name is"+name+", id is "+id + " gpa is"+ gpa;
    //     return s;
    // }

}

// class undergrad extends student{
//     private int year;
//     void setyear(int newyear){
//         year = newyear;
//     }

//     public int getyear(){
//         return year;
//     }
// }
// class graduate extends student{
//     private int thesistitle;

//     void setyear(int thesistitle){
//         this.thesistitle = thesistitle;
//     }

//     public int getthesistitle(){
//         return thesistitle;
//     } 

// }




public class laba {
    public static void main(String[] args){

        student s = new student("rohan", 5,7.9);
        


    }
}
