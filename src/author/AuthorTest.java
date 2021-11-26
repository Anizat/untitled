package author;
import com.sun.scenario.effect.impl.prism.PrImage;
import org.omg.PortableInterceptor.ORBIdHelper;
import sun.font.FontRunIterator;

import java.util.Scanner;

public class AuthorTest {
    private static Scanner scanner = new Scanner(System.in);
        private static AuthorStorage as = new AuthorStorage();
        private static BookStorage bs = new BookStorage();

        private static final String EXIT = "0";
        private static final String ADD_AUTHOR = "1";
        private static final String ADD_BOOK = "2";
        private static final String SEARCH_AUTHOR = "3";
        private static final String SEARCH_AUTHOR_BY_AGE = "4";
        private static final String SEARCH_BOOKS_BY_TITLE = "5";
        private static final String PRINT_AUTHORS= "6";
        private static final String PRINT_BOOKS= "7";
        private static final String DELETE_BY_AUTHOR= "8";
        private static final String DELETE_AUTHOR= "9";
        private static final String DELETE_BOOK= "10";
    private static String Book;

    public static void main(String[] args) {

        AuthorStorage.add(new AuthorClass("poxos", "poxosyan", "poxos@gmail.com", "male", 22));
        AuthorStorage.add(new AuthorClass("petros", "petrosyan", 33, "petros@gmail.com", "male"));
        AuthorStorage.add(new AuthorClass("martiros", "martyrosyan", 44, "martirosgmail.com", "female"));

        boolean isRun = true;
        while (isRun){
            String command = scanner.nextLine();
            switch (command){
                case EXIT:
                    isRun = false;
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case ADD_BOOK:
                    addBook();
                case SEARCH_AUTHOR:
                    searchAuthor();
                    break;
                case SEARCH_AUTHOR_BY_AGE:
                    searchAuthorByAge();
                    break;
                case SEARCH_BOOKS_BY_TITLE:
                    searchBooksByTitle();
                    break;
                case PRINT_AUTHORS:
                    as.print();
                    break;
                    case PRINT_BOOKS:
                case DELETE_AUTHOR:
                    deleteAuthor();
                    break;
                case DELETE_BY_AUTHOR:
                    deleteByAuthor();
                    break;
                case DELETE_BOOK:
                    deleteBook();
                    break;

                default:
                    System.out.println("invalid command!");
            }
        }
    }

    private static void deleteAuthor(AuthorClass email) {
        int size;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (Book[i].getBook().equals(email)){
                    deleteAuthor(email);
                }
            }
        }
    }

    private static void deleteBook(Book title) {
        int size;
        for (int i = 0; i < size; i++) {
            if (Book[i].getBook().equals(title)){
                deleteBook(title);
            }

        }
    }

    private static void deleteByAuthor(AuthorClass email) {
        int size = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (Book[i].getAuthor().equals(email)){
                    deleteBook(email);
                }
            }

        }

    }

    private static void searchBooksByTitle() {
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        bs.searchBooksByTitle (keyword);
    }

    private static void addBook() {
        System.out.println("Please input book's title");
        String title = scanner.nextLine();
        System.out.println("Please input book's description");
        String description = scanner.nextLine();
        System.out.println("Please input book's price");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input book's count");
        int count = Integer.parseInt(scanner.nextLine());

        Book book = new Book(title, description, price, count);

        BookStorage.add(book);
        System.out.println("Thank you, book was added");
    }

    private static void printCommands(){
        System.out.println("please input: " + EXIT + "for EXIT");
        System.out.println("please input: " + ADD_AUTHOR + "for ADD_AUTHOR");
        System.out.println("please input: " + ADD_BOOK + "for ADD_BOOK");
        System.out.println("please input: " + SEARCH_AUTHOR + "for SEARCH_AUTHOR");
        System.out.println("please input: " + SEARCH_AUTHOR_BY_AGE + "for SEARCH_AUTHOR_BY_AGE");
        System.out.println("please input: " + SEARCH_BOOKS_BY_TITLE + "for SEARCH_BOOKS_BY_TITLE");
        System.out.println("please input: " + PRINT_AUTHORS + "for PRINT_AUTHORS");
        System.out.println("please input: " + PRINT_BOOKS + "for PRINT_BOOKS");
    }
    private static void searchAuthorByAge(){
        System.out.println("Please input min age");
        int minAge = Integer.parseInt(scanner.nextLine());
        System.out.println("please input max age");
        int maxAge = Integer.parseInt(scanner.nextLine());
        as.searchAuthorByAge(minAge, maxAge);
    }
    private static void searchAuthor(){
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        as.searchAuthor(keyword);
    }

    private static void addAuthor(){
        System.out.println("please input author's name");
        String name = scanner.nextLine();
        System.out.println("please input author's surname");
        String surname = scanner.nextLine();
        System.out.println("please input author's email");
        String email = scanner.nextLine();
        System.out.println("please input author's gender");
        String gender = scanner.nextLine();
        System.out.println("please input author's age");
        int age = Integer.parseInt(scanner.next());

        AuthorClass au = new AuthorClass(name, surname, email, gender, age);

//        AuthorClass au = new AuthorClass();
 //       au.setName(name);
 //       au.setSurname(surname);
 //       au.setAge(age);
 //       au.setEmail(email);
//        au.setGender(gender);

        AuthorStorage.add(au);
        System.out.println("Thank you!Author was added");
    }
}

