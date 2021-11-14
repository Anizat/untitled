package BraceChecker;

public class BraceChecker {

    private static String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public static void check() {
        Stack stack = new Stack();
        boolean isValid = true;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int pop;
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    pop = stack.pop();
                    if (pop != '('){
                        System.err.println("Error; Closed " + c + "but opened " + (char) pop + "at: " + i);
                    }
                    break;
                case '}' :
                    pop = stack.pop();
                    if (pop != '{'){
                        System.err.println("Error; Closed " + c + "but opened " + (char) pop + "at: " + i);
            }
                    break;
                case ']' :
                    pop = stack.pop();
                    if (pop != '['){
                        System.err.println("Error; Closed " + c + "but opened " + (char) pop + "at: " + i);

        }
                    break;
    }
}
        if(isValid){
            System.out.println("Everything is good!");
        }
}
}

