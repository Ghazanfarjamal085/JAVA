// package Coding_Block.Loops;

import java.util.Scanner;

public class fibbo_method {
    static int next = 0;
    static int first = 0;
    static int second = 1;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nth_term = sc.nextInt();
        System.out.println(fibbo(nth_term));
    }

    static int fibbo(int nth_term) {
        if (nth_term == 1) {
            return 0;
        } else if (nth_term == 2) {
            return 1;
        } else {
            for (int i = 3; i <= nth_term; i++) {
                next = first + second;
                first = second;
                second = next;
            }
            return next;
        }
    }
}
