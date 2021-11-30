package Education;

import javax.naming.Name;

public class Storage<lesson, size> {
    private static int size;
    private static String email;
    private static String Student;
    private Student[] students = new Student[3];
    private static Lesson[] lesson = new Lesson[1];
    private lecturerName[] lecturerNames = new lecturerName[1];

    public static void add(Lesson lesson) {
        if (size == lesson.length) {
            extend();
        }
        lesson[size++] = lesson;
    }

    private static void extend() {
        Lesson[] tmp = new Lesson[lesson.length + 1];

        System.arraycopy(lesson, 0, tmp, 0, lesson.length);
        lesson = tmp;
    }

    public static Lesson getName() {
        for (int i = 0; i < size; i++) {
            if (lesson[i].getName().equals(getName())) {
                return lesson[i];
            }
        }

        public static Lesson getByName (String Lesson name){
            for (int i = 0; i < size; i++) {
                if (lesson[i].getName().equals(name)) {
                    return lesson[i];
                }
            }
            return null;
        }

        public static void deleteByName (String name){
            for (int i = 0; i < size; i++) {
                if (lesson[i].getName().equals(name)) {
                }
            }
        }
    }

    public static void deleteByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (Student[i].getEmail().equals(email)) {
            }
        }
    }

    public static Education.Student getByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (Student[i].getEmail().equals(email)) {
                return Student[i];
            }
        }
        return null;
    }

    public static Lesson getByName(String name) {
        for (int i = 0; i < size; i++) {
            if (lesson[i].getName().equals(name)){
                return lesson[i];
            }

        }
        return null;
    }

    public static Lesson deleteByName(String name) {
        for (int i = 0; i < size; i++) {
            if (lesson[i].getName().equals(name)) {
                return Lesson[i];
            }
        }
        return null;
    }

    public static void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(lesson[i]);
        }
    }
}

