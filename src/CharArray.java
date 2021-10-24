public class CharArray {
    public static void main(String[] args) {
        char[] CharArray = {'b', 'o', 'l', 'o', 'l','a'};
        char c = 'o';
        int count = 0;
        for (int i = 0; i < CharArray.length; i++) {
            if (CharArray[i] == c){
                System.out.println(i);


                for (int j = 0; j < CharArray.length; j++) {
                    if (CharArray[j] == 0);
                    count++;

                }
            }


        }
        System.out.println("The count of " + c +" is: " + count);


        System.out.println(CharArray[CharArray.length / 2]);
        System.out.println(CharArray[CharArray.length - 4]);



        boolean b = false;
        if (CharArray[CharArray.length - 2] == 'l' &&
                CharArray [CharArray.length - 1] == 'y'){
            System.out.println(true);
            b = true;

        }
        System.out.println(b);

        boolean isBob = false;
        for (int i = 0; i < CharArray.length; i++) {
            if (CharArray[i] == 'b' && CharArray[i + 2] == 'b'){
                System.out.println(true);

            }

        }
        System.out.println(isBob);



        char[] text = {' ',' ','b','a','r','e','v',' ',' '};
        int StartIndex = 0;
        int EndIndex = text.length - 1;
        while (StartIndex < EndIndex && text[StartIndex++] == ' '){
            StartIndex++;
        }
        System.out.println(text);



        }






    }

