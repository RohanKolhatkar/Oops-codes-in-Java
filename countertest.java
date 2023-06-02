import java.util.Arrays;
import java.util.List;
public class countertest {

        
    public void testCountingOddNumbers() {
        System.out.println("testCountingOddNumbers");
        List<Integer> ci = Arrays.asList(1, 2, 3, 4, 5, 6);
        long expected = 3l;
        long actual = counter.countIf(ci, behaviours::checkOddNumber);
        Assert.assertEquals(expected, actual);
    }

        
    public void testCountingPrimeNumbers() {
        System.out.println("testCountingPrimeNumbers");
        List<Integer> ci = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        long expected = 4l;
        long actual = counter.countIf(ci, behaviours::checkPrimeNumber);
        Assert.assertEquals(expected, actual);
    }    

}