import model1.Course;
import model1.Student;
import model1.enums.CourseName;

import java.util.List;

public class LoopsAndModel {
    public static void main(String[] args) {
        Course java = new Course(CourseName.JAVA, 15);
        Course web = new Course(CourseName.WEB, 10);

        System.out.println("This course is: " + java.getName());

        java.addStudent(new Student("Darja", "Ag.", "dasha@inbox.lv"));
        java.addStudent(new Student("Nikolajs", "Gr.", "nik@gmail.com"));
        java.addStudent(new Student("Natalja", "NoName", "natali@mail.ru"));
        java.addStudent(new Student("Kara", "Ko.", "ko@ko.ko"));
        java.addStudent(new Student("Jurijs", "Te.", "jurijs@te.lv"));

//        System.out.println(java.getStudents().size());
//        System.out.println(java.getStudents().get(1).getFirstName());

        List<Student> students = java.getStudents();

        //FOR
        for (int i = 0; i < students.size(); i++) { // i++ -> i = i +1
            System.out.println(students.get(i).getFullName());
        }

        System.out.println("-----------------------------------");

        //FOREACH
        for (Student s : students) {
            //System.out.println(s.getFullName());

            if (s.getFirstName().startsWith("N")) {
                //true
                System.out.println(s.getFullName());
            } else {
                //false
                System.out.println("This name is not starting from 'N'");
            }

            //statement ? true : false
            System.out.println(s.getFirstName().startsWith("N") ? s.getFullName() : "This name is not starting from 'N'" );
        }

        System.out.println("-----------------------------");

//        int i = 0;
//        while (i < 3) {
//            System.out.println(students.get(i).getFirstName());
//            i++;
//        }


//        boolean isNatalyFound = false;
//        while (!isNatalyFound) { // !true = false     !false = true
//            for (Student s : students) {
//                System.out.println(s.getFirstName());
//                if (s.getFirstName().equals("Natalja")) {
//                    System.out.println(s.getFullName());
//                    isNatalyFound = true;
//                    break;
//                }
//            }
//        }
    }
}
