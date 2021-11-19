package author;
import java.util.Scanner;

public class AuthorTest {
    public static void main(String[] args) {
        AuthorClass au = new AuthorClass("poxos", "poxosyan",
                "poxospoxosyan@gmail.com", 42, "male");

        System.out.println("Author" + au.getName() + au.getSurname());
        System.out.println("email" + au.getEmail());
        au.setEmail("poxospoxosyan@gmail.com");
        System.out.println("age" + au.getAge());
        System.out.println("gender"+ au.getGender());
        System.out.println("Author info: " + au.toString());



    }
}
