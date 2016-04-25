/**
 * For elements in array
 */
public class ExamTwoFor {
    public static void main(String[] args) {
        int array[] = {81,13,10,34,23,234,8,33};
        int value = array[0];
        int value2 = value;
        int count = 1;
        for (int element : array){
            if (element > value){
                value = element;
            }
            if (element < value2){
                value2 = element;
            }
            count++;
        }
        System.out.println(value+" "+value2);
        System.out.println(count);
    }
}
