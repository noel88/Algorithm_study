package chapter01;

import java.util.Scanner;

public class Training0101 {
    //TODO: 3개의 값을 입력 받고 최대값을 구한다.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("세 정수의 최대값을 구합니다.");
        System.out.print("a의 값: ");
        int a = scanner.nextInt();
        System.out.print("b의 값: ");
        int b = scanner.nextInt();
        System.out.print("c의 값: ");
        int c = scanner.nextInt();

        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        System.out.printf("최대값은 %d입니다.", max);
    }
}
