package bai_tap.phan_loai_tam_giac.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ClassificationOfTrianglesTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("canh 1: ");
        int canh1 = sc.nextInt();
        System.out.println("canh 2: ");
        int canh2 = sc.nextInt();
        System.out.println("canh 3: ");
        int canh3 = sc.nextInt();

        getClassificationOfTrianglesTest(canh1,canh2,canh3);
    }
    public static String getClassificationOfTrianglesTest(int canh1,int canh2,int canh3){
        boolean check = checkTamGiac(canh1,canh2,canh3);
        if (check){
            return getClassify(canh1,canh2,canh3);
        } else return "đây không phải tam giác";
    }
    public static boolean checkTamGiac(int canh1, int canh2, int canh3){
        Integer[] triangleSideArray = {canh1,canh2,canh3};
        int longestSide = Collections.max(Arrays.asList(triangleSideArray));
        int longestSideIndex= Arrays.asList(triangleSideArray).indexOf(longestSide);
        int totalTwoSideSmallSide = 0;
        for (int i = 0; i < triangleSideArray.length; i++) {
            if (i != longestSideIndex){
                totalTwoSideSmallSide += triangleSideArray[i];
            }
        }
        return totalTwoSideSmallSide > longestSide;
    }
    public static String getClassify(int canh1,int canh2,int canh3) {
        if (canh1 == canh2 && canh2 == canh3) {
            return "các cạnh bằng nhau";
        } else if (canh1 == canh2 || canh1 == canh3 || canh2 == canh3) {
            return "đây là tam giác cân";
        } else return "đây không phải tam giác";
    }
}
