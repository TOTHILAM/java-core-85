package backend;

import entity.Student;

import java.util.*;

public class Exercise01 {
    public static void question01() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("A"));
        students.add(new Student("B"));
        students.add(new Student("C"));
        students.add(new Student("D"));
        students.add(new Student("D"));
        students.add(new Student("F"));
        //        a) In ra tổng số phần tử của students
        System.out.println(students.size());

//        b) Lấy phần tử thứ 4 của students
        System.out.println(students.get(3));

//        c) In ra phần tử đầu và phần tử cuối của students
        System.out.println(students.get(0));
        int lastIndex = students.size() - 1;
        System.out.println(students.get(lastIndex));

//        d) Thêm 1 phần tử vào vị trí đầu của students
        students.add(0, new Student("Minh"));

//        e) Thêm 1 phần tử vào vị trí cuối của students
        students.add(new Student("Phong"));

//        f) Đảo ngược vị trí của students
        System.out.println(students);
        for (int i = 0; i <= students.size() / 2; i++) {
            Student s1 = students.get(i);
            Student s2 = students.get(students.size() - 1 - i);
            students.set(i, s2);
            students.set(students.size() - 1 - i, s1);
        }
        System.out.println(students);

//        j) Xóa name của student có id = 2;
        for (Student student : students) {
            if (student.getId() == 2) {
                student.setName(null);
            }
        }
//        k) Delete student có id = 5; xoá theo điều kiện
        students.removeIf(student -> student.getId() == 5);
    }

    public static Student findStudentById(List<Student> students, int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public static void showStudentSameName(List<Student> students) {
        //danh sách bị trùng
        List<String> l1 = new LinkedList<>();
        //danh sách chứ học sinh in ra ngoài màn hình
        List<String> l2 = new LinkedList<>();
        for (Student student : students) {
            String name = student.getName();
            if (l1.contains(name)) {
                if (!l2.contains(name)) {
                    l2.add(name);
                }
            } else {
                l1.add(name);
            }
        }
        System.out.println(l2);
    }

    public static void question06() {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Hùng");
        students.put(2, "Đức");

        // question07.a In ra các key của students
        // keySet trả về tập hợp các key
        Set<Integer> keys = students.keySet();
        for (Integer key : keys) {
            System.out.println("key = " + key);
        }

        // question07.b In ra value của students
        // value trả về bộ sưu tập collection
        for (String value : students.values()) {
            System.out.println("value = " + value);
        }

        // question07.c In ra danh sách students được sắp xếp theo tên của student
        List<String> list = new LinkedList<>(students.values());
        Collections.sort(list);
        System.out.println(list);
    }
}
