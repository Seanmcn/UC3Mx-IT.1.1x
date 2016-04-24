public class ExamOneBooleans {
    public static void main(String[] args) {
        boolean p = false;
        boolean q = true;
        boolean r = false;

        System.out.println((p && q) || r);

        System.out.println(!(p && (q ||r)));
    }
}
