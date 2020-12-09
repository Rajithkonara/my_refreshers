package basics.overrideeh;

public class StudentService {

    public static void main(String[] args) {

        Student student = new Student(1, "rajith", 15);
        Student student2 = new Student(2, "rajith", 15);

        System.out.println("Student :1" + student + "hashcode " + student.hashCode());
        System.out.println("Student :2" + student2 + "hashcode " + student2.hashCode());


        if (student.equals(student2)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

    }

}
