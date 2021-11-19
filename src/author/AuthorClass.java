package author;

public class AuthorClass {
    private String name;
    private String surname;
    private String email;
    private int age;
    private String gender;

    AuthorClass(){}

    AuthorClass(String name, String surname, String email, int age, String gender){
        name = this.name;
        surname = this.surname;
        email = this.email;
        age = this.age;
        gender = this.gender;

    }

    public String getName() {
        return this.name;

        String getSurname;() {
            return this.surname;
        }
        String getEmail;(){
            return this.email;
        }
        int getAge;(){
            return this.age;
        }
        public String getGender;(){
            return this.gender;
        }
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setEmail (String email){
        this.email = email;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String toString(){
        String info =this.name + this.surname + this.email +
                this.age +this.gender;
        return info;
    }
}
