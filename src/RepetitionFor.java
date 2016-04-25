/**
 * Simple for statement
 */
public class RepetitionFor {
    public static void main(String[] args){
        for (int i = 1; i <= 10; i = i + 3) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }
}
