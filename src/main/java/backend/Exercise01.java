package backend;

import entity.Student;

public class Exercise01 {
    public static void question01() {
        Student s1 = new Student("Nguyen Van A");
        Student s2 = new Student("Nguyen Van B");
        Student s3 = new Student("Nguyen Van C");

        Student.college = "Dai Hoc Bach Khoa";
        System.out.println("s1.college = " + s1.college);
        System.out.println("s2.college = " + s2.college);
        System.out.println("s3.college = " + s3.college);

        Student.college = "Dai Hoc Cong Nghe";
        System.out.println("s1.college = " + s1.college);
        System.out.println("s2.college = " + s2.college);
        System.out.println("s3.college = " + s3.college);
    }

    public static void question02() {
        Student s1 = new Student("Nguyen Van A");
        Student s2 = new Student("Nguyen Van B");
        Student s3 = new Student("Nguyen Van C");

        s1.moneyGroup += 100;
        s2.moneyGroup += 100;
        s3.moneyGroup += 100;
        System.out.println("Student.moneyGroup = " + Student.moneyGroup);

        s1.moneyGroup -= 50;
        System.out.println("Student.moneyGroup = " + Student.moneyGroup);

        s2.moneyGroup -= 20;
        System.out.println("Student.moneyGroup = " + Student.moneyGroup);

        s3.moneyGroup -= 150;
        System.out.println("Student.moneyGroup = " + Student.moneyGroup);

        s1.moneyGroup += 50;
        s2.moneyGroup += 50;
        s3.moneyGroup += 50;
        System.out.println("Student.moneyGroup = " + Student.moneyGroup);
    }
    public static void question05(){
        Student s1 = new Student("Nguyen Van A");
        Student s2 = new Student("Nguyen Van B");
        Student s3 = new Student("Nguyen Van C");
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("Student.count = " + Student.count);
    }
}
