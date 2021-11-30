package Education;

public class Lesson {
    public int length;
    private String Name;
    private double duration;

    public Lesson(String name, double duration) {
        this.Name = name;
        this.duration = duration;

    }
    public Lesson getName() {return Name;}
    public void setName(String name){
        this.Name = name;
    }

    double getduration(){
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }


    public void print() {
        int size;
        for (int i = 0; i < size; i++) {
            System.out.println(Lesson[i]);
        }
    }
}
