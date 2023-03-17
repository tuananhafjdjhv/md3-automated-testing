package thuc_hanh.caculator;

import java.util.Scanner;

public class CaculatorTest {
    public static int cong(int fisrt, int second) {
        return fisrt + second;
    }

    public static int tru(int fisrt, int second) {
        return fisrt - second;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap firt va second");
        int fisrt = sc.nextInt();
        int second = sc.nextInt();
        System.out.println(cong(fisrt, second) + " va " + tru(fisrt, second));
    }
}
