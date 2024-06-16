public class Deparment {
    int id;
    String name;

    public Deparment() {
        System.out.println("constructor 0 tham số");
    }

    public Deparment(String name) {
        System.out.println("constructor 1 tham số");
        this.id = 0;
        this.name = name;
    }

    public Deparment(int id, String name) {
        System.out.println("constructor 2 tham số");
        this.id = id;
        this.name = name;
    }
}
