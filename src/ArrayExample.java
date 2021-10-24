public class ArrayExample {
    public static void main(String[] args) {
        int[] array = {7, 5, 4, 2, 8, 2, 6};
        System.out.println("Duplicate elements in given array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j])
                    System.out.println(array[j]);

            }
        }
    }

}
