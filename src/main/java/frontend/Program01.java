package frontend;

import backend.Exercise01;
import entity.Student;

import java.util.ArrayList;
import java.util.List;

public class Program01 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("A"));
        students.add(new Student("B"));
        students.add(new Student("C"));
        students.add(new Student("D"));
        students.add(new Student("D"));
        students.add(new Student("F"));
        Exercise01.showStudentSameName(students);
    }
}
