package homework;

public class StudentTest {
    public static void main(String[] args) {
        Student poxos = new Student("poxos", "poxosian", "094555555",
                23,"Java");
        System.out.println(poxos.getName());
        poxos.setName("poxosik");
        System.out.println(poxos.getName());
    }

}
