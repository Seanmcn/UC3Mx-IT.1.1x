public class ExamOneStrings {
    public static void main(String[] args) {
        String a = "This is a String.";

        String b = "This is another String.";

        String c = "Another String this is.";

        if (b.length() > c.length()) {
            System.out.println(b);
        } else if (c.length() > b.length()) {
            System.out.println(c);
        } else {
            System.out.println(b.charAt(0) + "E" + c.charAt(0));
        }

        if (a.length() > b.length()) {
            System.out.println(a);
        } else if (b.length() > a.length()) {
            System.out.println(b);
        } else {
            System.out.println(a + b);
        }
    }
}
