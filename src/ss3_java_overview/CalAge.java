package ss3_java_overview;

import java.time.Year;
import java.util.Scanner;

public class CalAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao tuoi cua ban: ");

        int age = scanner.nextInt();

        System.out.println("Tuoi cua ban la: " + (Year.now().getValue() - age));

        //How to ... in java

        int a= 2;
        int b = 3;

        System.out.println( ((double)a / b));
    }
}
