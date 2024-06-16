public class ArrayDemo {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 3, 6, 8};
        String[] names = new String[]{"Lam", "Kien", "Anh"};
        int[] array = new int[5];

        // kích thước của mảng
        System.out.println("numbers.length = " + numbers.length);
        System.out.println("names.length = " + names.length);
        System.out.println("array.length = " + array.length);

        // truy cập dựa theo chỉ số (index)
        // chỉ số của mảng bắt đầu từ 0
        System.out.println("names[1] = " + names[1]);
        int lastIndex = numbers.length - 1;
        System.out.println("numbers[index] = " + numbers[lastIndex]);

        // lặp các phần tử trong mảng từ trái qua phải
        int i = numbers.length;
        for (int j = 0; j < i; j++) {
            System.out.print(numbers[j] + " ");
        }
        // lặp các phần tử trong mảng từ phải qua trái
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(numbers[j] + " ");
        }
        // in ra các phần tử tương ứng với số index của nó
        for (int j = 0; j < i; j++) {
            System.out.println("numbers[" + j + "]" + numbers[j]);
        }
    }
}
