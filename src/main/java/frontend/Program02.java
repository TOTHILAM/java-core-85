package frontend;

import util.ScannerUtil;

public class Program02 {
    public static void main(String[] args) {
        ScannerUtil scannerUtil = new ScannerUtil();
        System.out.println("Nhập vào số nguyên");
        int number = scannerUtil.inputInt();
        System.out.println("number = " + number);
    }
}
