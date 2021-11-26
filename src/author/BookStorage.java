package author;

import java.util.Scanner;

public class BookStorage {

    private static Book [] books = new Book[10];
    private static int size = 0;
    public String searchBooksByTitle;
    private Scanner scanner;


    public static void add(Book book){
        if (size == books.length){
            extend();
        }
        books[size++] = book;
    }

    private static void extend() {
        Book [] tmp = new Book[books.length + 10];

        System.arraycopy(books, 0, tmp, 0, books.length);
        books = tmp;
    }

    public void print (){
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public void searchBooksByTitle() {
        System.out.println("please input keyword");;
        String keyword = scanner.nextLine();
    }

    public void searchBooksByTitle(String keyword) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().contains(keyword)){
                System.out.println(books[i]);
            }

        }
    }
}
