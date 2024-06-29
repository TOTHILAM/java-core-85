package com.vti.util;

import java.util.Scanner;

public class ScannerUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static String inputString() {
        return scanner.nextLine()
                .trim()
                //loại bỏ khoảng trắng dư thừa
                .replaceAll("\\s{2,}", " ");
        // loại bỏ khoảng trắng dư thừa ở giữa có từ 2 dấu cách trở lên và thay bằng 1 dấu cách
    }

    public static String inputEmail() {
        while (true) {
            String input = inputString();
            if (input.contains("@")) {
                return input;
            } else {
                System.out.println("Yêu cầu chứa @");
                System.out.println("Yêu cầu nhập lại");
            }
        }
    }

    public static int inputInt() {
        while (true) {
            try {
                String input = inputString();
                return Integer.parseInt(input);
            } catch (NumberFormatException exception) {
                System.err.println("Yêu cầu nhập vào số nguyên.");
                System.err.println("Mời bạn nhập lại:");
            }
        }
    }

    //　bắt người dùng nhập đúng tên thì thôi
    public static String inputFullName() {
        while (true) {
            String input = inputString();
            if (hasAllAlphabeticCharacter(input)) {
                return input;
            } else {
                System.out.println("Yêu cầu fullname chỉ chứ chữ");
                System.err.println("Nhập lại");
            }
        }
    }

    // kiểm tra xem tất cả có phải là alphabetic không
    private static boolean hasAllAlphabeticCharacter(String s) {
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            // đầu tiên kiểm tra xem kí tự có phải dấu cách hay không
            if (Character.isWhitespace(c)) {
                continue;
            }
            if (!Character.isAlphabetic(c)) {
                return false;
            }
        }
        return true;
    }

    public static String inputPassword() {
        while (true) {
            String input = inputString();
            int length = input.length();
            if (length < 6 || length > 12) {
                System.out.println("Yêu cầu password dài 6->12 kí tự");
                System.out.println("Nhập lại");
            } else if (hasAnyUpperCaseCharacter(input)) {
                return input;
            } else {
                System.out.println("Yêu cầu ít nhất 1 kí tự viết hoa");
                System.err.println("Nhập lại");
            }
        }
    }

    // kiểm tra xem có bất kì kí tự viết hoa nào hay k
    public static boolean hasAnyUpperCaseCharacter(String s) {
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }
}
