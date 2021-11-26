package author;

public class AuthorStorage {
    private static int size;
    private static AuthorClass[] authors;
    private AuthorClass [] authorClasses = new AuthorClass[10];


    public static void add(AuthorClass authorClass){
        if (size == authors.length){
            extend();
        }
        authors[size++] = authorClass;
    }

    private static void extend() {
        AuthorClass [] tmp = new AuthorClass[authors.length + 10];

        System.arraycopy(authors, 0, tmp, 0, authors.length);
        authors = tmp;
    }

    public void print (){
        for (int i = 0; i < size; i++) {
            System.out.println(authors[i]);
        }
    }
    public void searchAuthor(String keyword){
        for (int i = 0; i < size; i++) {
            if (authors[i].getName().contains(keyword) ||
                    authors[i].getSurname().contains(keyword)){
                System.out.println(authors[i]);
            }
        }
    }
    public void searchAuthorByAge (int minAge, int maxAge){
        for (int i = 0; i < size; i++) {
            if (authors[i].getAge() >= minAge &&
                    authors[i].getAge() <= maxAge){
                System.out.println(authors[i]);
            }

        }
    }
}
