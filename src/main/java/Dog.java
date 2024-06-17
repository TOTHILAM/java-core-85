public class Dog extends Pet {

    public Dog(int age, String name) {
        super(age, name);
    }

    @Override
    public void run() {
        super.run();
        System.out.println(getName() + " is running...");
    }
}
