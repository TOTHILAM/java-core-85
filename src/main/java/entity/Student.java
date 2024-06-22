package entity;public class Student {
    private int id;
    private String name;

    public static String college;
    public static int moneyGroup;
    public static int count;

    public Student(String name) {
        if (count <= 7){
            throw new IllegalStateException("du 7 hoc sinh");
        }
        count++;
        this.name = name;
        this.id = count;
    }

    public static void setCollege(String college) {
        Student.college = college;
    }

    public static String getCollege() {
        return college;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
