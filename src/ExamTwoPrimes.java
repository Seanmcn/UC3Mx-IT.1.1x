/**
 * Print out factors but only the first
 */
public class ExamTwoPrimes {
    public static void main(String[] args) {
        int number = 604;
        int count = 0;
        for (int factor = 2; factor <= number; factor++) {

            while (number % factor == 0) {
                count++;
                if(count == 1){
                    System.out.println(factor);
                }
                number = number / factor;
            }
            count = 0;
        }
    }
}
