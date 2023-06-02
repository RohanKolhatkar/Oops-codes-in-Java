public class behaviours {
 
    public static boolean checkOddNumber(final int num) {
        return num % 2 != 0;
    }

    public static boolean checkPrimeNumber(final int num) {
        if (num == 0 || num == 1) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}