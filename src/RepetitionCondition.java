/**
 * Incorrect while statement, produces infinite 1's
 */
public class RepetitionCondition {

    public static void main(String[] args) {
        int num = 13 * 7 * 23;
        int a = 1;

        while (a <= num / 2) {
            if (num % a == 0) {
                System.out.print(a + " ");
            }
        }
        System.out.println(" ");
    }
}
