package arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {3, 6, 22, 14, 88, 65, 333, 6, 4, 1};
        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max number is:" + max);

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min number is:" + min);

        System.out.println("Print only even numbers");
        for (int i = 1; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i] + " ");

            }
        }


        System.out.println("Print only odd numbers");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i] + " ");
            }
        }
        int CountEvenNums = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                CountEvenNums++;


            }
        }
        System.out.println("The count of even numbers is:"+CountEvenNums);


        int CountOddNums = 0;
        for (int i = 1; i < array.length ; i++) {
            if (array[i] % 2 != 0){
                CountOddNums++;
            }
        }
        System.out.println("The count of odd numbers is:"+CountOddNums);


        int sum = 0;
        for (int i = 0; i < array.length ; i++) {
            sum += array[i];
        }
        System.out.println("sum:" + sum);
        System.out.println("avg:" + sum/ array.length);



        }
    }

