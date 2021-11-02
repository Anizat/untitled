package homework;

public class PracticeHomework {
    long convert(int minutes) {
        long seconds = minutes * 60;
        return seconds ;
    }
    int calcAge(int years) {
        int days = years * 365;
        return days;
    }
    int nextNumber(int number) {
        int Nextnumber = number++;
        return Nextnumber;
    }


    boolean  SameNum;
    boolean isSameNum(int a, int b) {
        if (a == b){
            SameNum = true;}
        else SameNum = false;

            return SameNum;
        }


        boolean num;
        boolean lessThanOrEqualToZero(int number) {
            if (num < = 0){
                num = true;
            }
            else num = false;
        return num;


            boolean reverseBool;(boolean value;) {
                if (value == true){
                    value = false;
                }else if (value == false)
                    value = true;
                return value;
            }
    }

        int [] array1 = {};
        int[] array2 = {};
        int length;

        int maxLength(int[] array1, int[] array2) {
            if (array1.length < array2.length){
                length = array1.length;
            }else if (array2.length < array1.length);
        return length;
    }









}
