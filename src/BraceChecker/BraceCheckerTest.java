package BraceChecker;

public class BraceCheckerTest {
    public static void main(String[] args) {
        String text = "hello (from} jav[a]";
        BraceChecker braceChecker = new BraceChecker(text);
        BraceChecker.check();
    }
}
