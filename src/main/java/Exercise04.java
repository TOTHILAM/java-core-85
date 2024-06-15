import java.util.Random;

public class Exercise04 {
    void question1(){
        Random random = new Random();
        int a = random.nextInt();
        System.out.println("a = " + a);
    }
    void question2(){
        Random random = new Random();
        float b = random.nextFloat();
        System.out.println("a = " + b);
    }
    void question3(){
        Random random = new Random();
        String[] names = {"Lâm","Lan","Hà","Kiên","Anh"};
        int index = random.nextInt(names.length);
        System.out.printf("index: %d, name: %s%n", index,names[index]);
    }
    void question7(){
        Random random = new Random();
        int min = 100;
        int max = 999;
        int c = min + random.nextInt(max - min + 1);
        System.out.println("c = " + c);
    }
}
