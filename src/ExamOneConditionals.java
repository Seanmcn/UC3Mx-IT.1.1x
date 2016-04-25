/**
 * Testing boolean conditionals.
 */
public class ExamOneConditionals {
    public static void main(String[] args) {
        int w = 9;
        int x = 51;
        int y = 10;
        int z = 50;

        if (50 < w || !(w > 9)) {
            System.out.println("W Passed");
        } else {
            System.out.println("W Failed");
        }

        if (50 < x || !(x > 9)) {
            System.out.println("X Passed");
        } else {
            System.out.println("X Failed");
        }

        if (50 < y || !(y > 9)) {
            System.out.println("Y should not have passed");
        } else {
            System.out.println("Y didn't pass yay!");
        }

        if (50 < z || !(z > 9)) {
            System.out.println("Z should not have passed");
        } else {
            System.out.println("Z didn't pass yay!");
        }

        if (50 < w || w < 10) {
            System.out.println("W Passed");
        } else {
            System.out.println("W Failed");
        }

        if (50 < x || x < 10) {
            System.out.println("X Passed");
        } else {
            System.out.println("X Failed");
        }

        if (50 < y || y < 10) {
            System.out.println("Y should not have passed");
        } else {
            System.out.println("Y didn't pass yay!");
        }

        if (50 < z || z < 10) {
            System.out.println("Z should not have passed");
        } else {
            System.out.println("Z didn't pass yay!");
        }
    }
}
