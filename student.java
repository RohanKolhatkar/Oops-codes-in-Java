import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collection;
import java.util.function.Supplier;
import java.util.Set;
import java.util.HashSet;
import java.time.chrono.IsoChronology;



public class student {
    private String subject;
    private String name;
    private String surname;
    private String city;
    private int age;
    //constructor getter setter abd tostring.
    student(String subject, String name, String surname, String city, int age){
        this.subject = subject;
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.age = age;
    }
    
    String getsubject(){
        return subject;

    }
    int getage(){
        return age;
    }

    // @Override
    public String tostring(){
        return name + "is coming from" + city;
    }
}


class demogroupingby{
    public static void main(String[] args){
        List<student> students = Arrays.asList(
            new student("math", "john", "smith", "miami",19),
            new student("maths", "johfn", "smidth", "miadmi",89)
        );
        Map<String, List<student>> studentbysubject = student.stream().collect(Collectors.groupingBy(student::getsubject));
        System.out.println(studentbysubject);
        Set<String> keys = studentbysubject.keySet();
        for(String key:keys){
            List<student> studies = studentbysubject.get(key);
            System.out.println(key+" : ");
            for(student s: studies){
                System.out.println(s);
            }
        }


    }
}










