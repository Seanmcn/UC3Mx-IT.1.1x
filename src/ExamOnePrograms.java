public class ExamOnePrograms {
    public static void main(String[] args) {
        int p = 1;
        int q = 2;
        int r = 3;
        if (r > p + q) {
            r = 2 * p;
        }
        else if (r < p + q) {
            r = 2 * q;
        }
        else {
            q = 2 * r;
        }

        System.out.println (r);
        System.out.println (q);

        int a = 5;
        int b = 2;
        String c = "52";
        String result = a+"+"+b+"="+c;
        System.out.println (result);
    }
}
