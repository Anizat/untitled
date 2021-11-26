package author;

public class AuthorClass {
    private String name;
    private String surname;
    private String email;
    private int age;
    private String gender;


    public AuthorClass(String name, String surname, int email, String age, String gender){
        name = this.name;
        surname = this.surname;
        email = this.email;
        gender = this.gender;
        age = this.age;

    }
    public AuthorClass(String name, String surname, String email, String gender, int age){
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

        public String getGender(){
            return gender;
        }
    public void setGender(String gender){
        this.gender = gender;
    }
    @Override
    public String toString(){
        return "Author" + "name = " + name +'\'' + ", surname = " + surname +'\'' +
                ", age = " + age + '\'' + ", email = " + email + '\'' + ", gender = " + gender + '\'';}
}
