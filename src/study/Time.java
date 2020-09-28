package study;

import java.time.LocalDate;

public class Time {
    public static void main (String args[]){
        LocalDate dateOne = LocalDate.now();
        System.out.println("本地日期"+dateOne);
        LocalDate dateTwo = LocalDate.of(2019,1,22);
        System.out.println("自定日期"+dateTwo);
        System.out.println(dateOne+"在"+dateTwo+"之后："+dateOne.isAfter(dateTwo));

    }
}
