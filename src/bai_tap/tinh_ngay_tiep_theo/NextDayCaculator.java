package bai_tap.tinh_ngay_tiep_theo;

import java.util.Arrays;
import java.util.Scanner;

public class NextDayCaculator {
    public static final String nextDay = "nextDay";
    public static final String nextMonth = "nextMonth";
    public static final String nextYear = "nextYear";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap ngay");
        int day = sc.nextInt();
        System.out.println("nhap thang");
        int month = sc.nextInt();
        System.out.println("nhap nam");
        int year = sc.nextInt();
        System.out.println(getNextDay(day,month,year));
    }
    public static boolean checkMonth31(int month){
        int[] month31 = {1,3,5,7,8,10,12};
        return Arrays.stream(month31).anyMatch(i -> i==month);
    }
    public static String getNextDayCaculator(String action,int dayNumber,int month,int year){
        String temp;
        StringBuilder nextDaySum = new StringBuilder();
        switch (action){
            case nextDay:
                temp = (dayNumber+1) + month + "/" + year;
                nextDaySum.append(temp);
            case nextMonth:
                temp = 1 + "/" + (month + 1) + "/" + year;
                nextDaySum.append(temp);
            case nextYear:
                temp = 1 + "/" + 1 + "/" + (year + 1);
                nextDaySum.append(temp);
        }
        return nextDaySum.toString();
    }
    public static String getNextDay(int dayNumber,int month,int year){
        boolean isFebruary = month == 2;
        boolean isEndYear = month == 12 && dayNumber == 31;
        boolean is31DayInMonth = checkMonth31(month);
        boolean is30DayInMonth = !is31DayInMonth && !isFebruary;
        if (isFebruary && dayNumber < 29) {
            return getNextDayCaculator(nextDay, dayNumber, month, year);
        } else if (isEndYear) {
            return getNextDayCaculator(nextYear, dayNumber, month, year);
        } else if (is31DayInMonth && dayNumber < 31) {
            return getNextDayCaculator(nextDay, dayNumber, month, year);
        } else if (is30DayInMonth && dayNumber <30) {
            return getNextDayCaculator(nextDay, dayNumber, month, year);
        } else {
            return getNextDayCaculator(nextMonth, dayNumber, month, year);
        }
    }
}
