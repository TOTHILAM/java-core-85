public class Dog implements Comparable<Dog> {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Dog(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Dog that) {
        return Integer.compare(this.id,that.id); // sắp xếp tăng dần
       // return Integer.compare(that.id,this.id); // sắp xếp giảm dần
       // return Integer.compare(that.name.length,this.name.length); // sắp xếp giảm dần độ dài của String

        // nếu số nguyên trả về là 1 số dương tức id con this lớn hơn that
        // bằng nhau thì trả về 0, nhỏ hơn thì trả về số âm
    }
}
