package Education;

import author.AuthorStorage;

import java.util.Scanner;

public class TestClass<isRun> {
    static Scanner scanner = new Scanner(System.in);
    Lesson lesson = new Lesson("java lesson", 45);
        Student student = new Student("poxos", "poxosyan", "poxos@gmail.com", "java lesson", 22, 698745230
                "martiros", "martirosyan", "martiros@gmail.com", "java lesson", 33, 6748392,
                "martin", "martinyan", "martin@gmail.com", "java lesson", 44, 67438293);
        lecturerName lecturerName = new lecturerName();
        Storage storage = new Storage();

        private static final String EXIT = "0";
        private static final String ADD_LESSON = "1";
        private static final String ADD_STUDENTS = "2";
        private static final String PRINT_STUDENTS = "3";
        private static final String PRINT_STUDENTS_BY_LESSON = "4";
        private static final String PRINT_LESSON = "5";
        private static final String DELETE_LESSON_BY_NAME = "6";
        private static final String DELETE_STUDENT_BY_EMAIL = "7";

        private static void printCommands(){
            System.out.println("\u001B[34m" + "please input " + EXIT + " for EXIT");
            System.out.println("please input " + ADD_LESSON + " for add LESSON");
            System.out.println("please input " + ADD_STUDENTS + " for add STUDENTS");
            System.out.println("please input " + PRINT_STUDENTS+ " for PRINT STUDENTS");
            System.out.println("please input " + PRINT_STUDENTS_BY_LESSON + " for PRINT STUDENTS BY LESSON");
            System.out.println("please input " + PRINT_LESSON + " for PRINT LESSON");
            System.out.println("please input " + DELETE_LESSON_BY_NAME + " for DELETE LESSON BY NAME");
            System.out.println("please input " + DELETE_STUDENT_BY_EMAIL + " for DELETE STUDENTS BY EMAIL");
        }


    public static void main(String[] args) {
        Storage.add(new Student("poxos", "poxosyan", "poxos@gmail.com","java", 22);
        Storage.add(new Student("petros", "petrosyan", "petros@gmail.com", "java lesson", 33 ,));
        Storage.add(new Student("martiros", "martirosyan", "martiros@gmail.com", "java lesson", 44,))
    }
    boolean isRun = true;
        while (isRun){
            printCommands();
    }
         {
        String command = scanner.nextLine();
        switch (command){
            case EXIT:
                isRun = false;
                break;
            case ADD_LESSON:
                addLesson();
                break;
            case ADD_STUDENTS:
                addStudents();
            case PRINT_STUDENTS:
                student.print();
                break;
            case PRINT_STUDENTS_BY_LESSON:
                printStudentsByLesson.print();
                break;
            case PRINT_LESSON:
                lesson.print();
                break;
            case DELETE_LESSON_BY_NAME:
                deleteLessonByName();
                break;
            case DELETE_STUDENT_BY_EMAIL:
                deleteStudentByEmail();
                break;
            default:
                System.out.println("Invalid command!");

    }
        }

    private void deleteStudentByEmail() {
            printLessonsList();
            String email = scanner.nextLine();
            Student student = Storage.getByEmail(email);
            if (student != null){
                Storage.deleteByEmail(email);
            }else {
                System.err.println("Email does not exist");
            }
    }
//      for some reason here that i dont understand i cant write the method since it doesn't recognise it
        private void printByLesson(){

        }

    private void deleteLessonByName() {
        printLessonsList();
        String name = scanner.nextLine();
        Lesson lesson = Storage.getByName(name);
        if (lesson != null) {
            Storage.deleteByName(name);
        } else {
            System.err.println("Name does not exists");

        }
    }

    private void printLessonsList() {
        System.out.println("please choose lesson's name");
        System.out.println("--------");
        Storage.print();
        System.out.println("--------");
    }


    private void addStudents() {
        System.out.println("please input student's name,surname,email,class,age,phone");
        String StudentDataStr = scanner.nextLine();
        String[] studentData = StudentDataStr.split(",");
        if (StudentDataStr.length() == 6) {
            int age = Integer.parseInt(studentData[5]);
            int phone = Integer.parseInt(studentData[6]);
            Student student = new student (studentData[0], studentData[1], studentData[2], studentData[3], studentData[4], age, phone);

            if (Storage.getByEmail(student.getEmail()) != null) {
                System.err.println("Invalid email. Student with this email already exists");
            } else
                Storage.add( Student);
                System.out.println("Thank you, student was added");
            }
        } else {
            System.err.println("invalid data");
        }


    private void addLesson() {
        System.out.println("please input lesson's name,surname,email,age,phone");
        String lessonDataStr = scanner.nextLine();
        String[] lessonData = lessonDataStr.split(",");
        if (lessonDataStr.length() == 2) {
            double duration = double.parseDouble(lessonData[1]);
            Lesson lesson = new Lesson(lessonData[1],double duration);

            if (Storage.add(Storage.getName()) != null) {
                System.err.println("Invalid name. Author with this name already exists");
            } else {
                Storage.add(lesson);
                System.out.println("Thank you, lesson was added");
            }
        } else {
            System.err.println("invalid data");
        }
    }
}

