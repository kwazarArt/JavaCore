package main.java.com.kwazarArt.javacore.Chapter03;

public class Array {
    public static void main(String[] args) {
        int month_day[];
        month_day = new int[12];
        month_day[0] = 31;
        month_day[1] = 28;
        month_day[2] = 31;
        month_day[3] = 30;
        month_day[4] = 31;
        month_day[5] = 30;
        month_day[6] = 31;
        month_day[7] = 31;
        month_day[8] = 30;
        month_day[9] = 31;
        month_day[10] = 30;
        month_day[11] = 31;
        System.out.println("В апреле " + month_day[3] + " дней");
    }
}
