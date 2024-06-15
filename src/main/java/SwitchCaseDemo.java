public class SwitchCaseDemo {
    public static void main(String[] args) {
        int month = 4;
        switch (month){
            case 2:
                System.out.println("có 28 hoặc 29 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("có 30 ngày");
                break;
            default:
                System.out.println("không biết");
                break;
        }
    }
}
