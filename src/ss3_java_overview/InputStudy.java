package ss3_java_overview;

import java.util.Scanner;

public class InputStudy {
    public static void main(String[] args) {
        // System.in: Tiêu chieu de nhap du lieu tu ban phim
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vao ten cua ban: ");
        String name = scanner.nextLine();

        System.out.print("Nhap vao tuoi cua ban: ");
        int age = scanner.nextInt();

        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
    }
}
