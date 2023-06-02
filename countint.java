// lab-04 problem -01
import java.util.*;
import java.util.function.Predicate;

class countertest {
    public void testCountingOddNumbers() {
        System.out.println("testCountingOddNumbers");
        List<Integer> ci = Arrays.asList(1, 2, 3, 4, 5, 6);
        long expected = 3l;
        long actual = countint.countIf(ci, Behaviours::checkOddNumber);
        Assert.assertEquals(expected, actual);
    }

    public void testCountingPrimeNumbers() {
        System.out.println("testCountingPrimeNumbers");
        List<Integer> ci = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        long expected = 4l;
        long actual = Counter.countIf(ci, Behaviours::checkPrimeNumber);
        Assert.assertEquals(expected, actual);
    }  
    
    
}

class Behaviours{
    public  boolean checkOddNumber(final int num) {
        return num % 2 != 0;
    }

    public  boolean checkPrimeNumber(final int num) {
        if (num == 0 || num == 1) {
            return false;
        }else{
            return true;
        }
    }
}


    
public class countint {
    public static <T> long countIf(Collection<T> collection, Predicate<T> predicate) {
        return collection.stream()
                         .filter(predicate)
                         .count();
    }
}