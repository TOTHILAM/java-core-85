public class Pet {
    private String name;
    private int age;

    public void run() {
        System.out.println("Pet is running");
    }

    public String getName() {
        return name;
    }

    public Pet(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
