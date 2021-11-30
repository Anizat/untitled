package Education;

public class Student {
    private String name;
    private String surname;
    private int age;
    private String email;
    private int phone;
    private String lesson;

    public Student(String name , String surname, String email, String lesson, int age, int phone){
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.lesson = lesson;
        this.age = age;
        this.phone = phone;
    }


    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    String getSurname() {
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    String getEmail(){
        return email;
    }
    public void setEmail (String email){
        this.email = email;
    }
    int getAge(){
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getLesson(){
        return lesson;
    }
    public void setLesson(String lesson){
        this.lesson = lesson;
    }

    int getPhone(){
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void print() {
        int size;
        for (int i = 0; i < size; i++) {
            System.out.println(Student[i]);
        }
    }
}
