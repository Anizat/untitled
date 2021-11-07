package DynamicArray;

public class DynamicArray {
    private int [] array = new int[10];
    private int size = 0;

    public void add (int value){
        if (array.length == size){
            extend();
        }
        array [size++] = value;
    }

    private void extend() {
        int [] tmp = new int [array.length + 10];
        for (int i = 0; i < array.length; i++) {
            tmp [i] = array [i];
        }
        array = tmp;
        }


    public void print (){
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]+ " ");

        }
    }
}
