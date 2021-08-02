package lesson2;


import sun.util.calendar.LocalGregorianCalendar;

import java.time.Year;
import java.util.Calendar;

public class lesson2 {
    public static void main(String[] args) {
        // входные параметры к первому зд
        boolean flag = summNumber(6, 4);
        System.out.println(flag);
        // входные параметры ко второму зд
        String result = sravni(0);
        System.out.println(result);
        // входные параметры к третьему зд
        boolean flaG = sRavni(-35);
        System.out.println(flaG);
        // входные параметры к четвертому зд
        Print("напечатано", 4);
        // входные параметры к пятому зд
        System.out.println(year(2000));

    }

    // зд1
    public static boolean summNumber(int a, int b) {
        return 10 <= a + b && a + b <= 20;
    }

    // зд2
    public static String sravni(int a) {
        if (a < 0) {
            return "Число отрицательное";
        } else {
            return "Число положительное";
        }
    }

    // зд 3
    public static boolean sRavni(int a) {
        return a < 0;
    }

    // зд 4
    public static void Print(String a, int b) {
        while (b > 0) {
            System.out.println(a + " " + b + " " + "(количество печати)");
            b--;
        }
    }

    // зд 5
    public static boolean year(int a) {
//
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0 ) {
                return true;} // не совсем понимаю как тут срабатывает и (или), но оно срабатывает верно)))
                            // уточню на лекции
        else {
            return false;
        }
    }
}






