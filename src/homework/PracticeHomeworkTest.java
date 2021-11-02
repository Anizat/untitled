package homework;

public class PracticeHomeworkTest {
    public static void main(String[] args) {
        PracticeHomework myConvert = new PracticeHomework();
        PracticeHomework array1 = new PracticeHomework();
        PracticeHomework arra2 = new PracticeHomework();
        int [] numbers1 = {1 , 2 , 3, 4 , 5 , 8, 9 , 10};
        int [] numbers2 = {1 , 45 , 37 , 4 , 58 , 6 , 87 , 8 , 9 , 1 , 4 , 5 , 8};

        System.out.println(myConvert.convert(60)+ "seconds");
        System.out.println(myConvert.calcAge(2)+ "days");
        System.out.println(myConvert.nextNumber(37)+ " is the next number ");
        System.out.println(myConvert.isSameNum(3 , 3 )+ " are the same number");
        System.out.println(myConvert.lessThanOrEqualToZero(-10)+ " is less than zero");
        System.out.println(myConvert.reverseBool(false));
        System.out.println("The maximal length of arrays "+ myConvert.maxLength(array1));



    }
}
