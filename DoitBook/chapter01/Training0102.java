package chapter01;

import java.util.Scanner;

public class Training0102 {
    //TODO: 여려값에 대해서도 최대값이 제대로 동작하는지 확인한다.

    static int max3(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("max3(3,2,1) = " + max3(3,2,1) );
        System.out.println("max3(4,2,1) = " + max3(4,2,1) );
        System.out.println("max3(3,8,1) = " + max3(3,8,1) );
        System.out.println("max3(0,2,1) = " + max3(0,2,1) );
        System.out.println("max3(3,2,9) = " + max3(3,2,9) );
        System.out.println("max3(3,7,1) = " + max3(3,7,1) );
    }
}
