package lesson1;

// зд 1
public class lesson1 {
    public static void main (String [] args) {
        System.out.println("Lesson 1");
        System.out.println("________");
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    // зд 2
    public static void printThreeWords () {
        //способ первый делаем перенос строки символом
        System.out.println("Orange"+"\n"+"Banan"+"\n"+"Apple");
        // способ второй делаем перенос строки через переменную
        String peremenaia = "Orange"
                + System.lineSeparator() + "Banan"
                + System.lineSeparator() + "Apple";
        System.out.println(peremenaia);
    }
    // зд 3
    public static void checkSumSign() {
        int a = -8;
        int b = 5;
        a += b; // подумал что в задании сказано что нужно обьявить только две переменные, третью нельзя
        // и поэтому решил сделать сложение с присвоением
        if (a >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }
    // зд 4 тут мне нечего добавить))
    public static void printColor() {
        int value = 0;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }
    // зд 5
    public static void compareNumbers() {
        int a = 5;
        int b = 7;
        if (a >= b) {
            System.out.println("a>=b");
        }
        else {
            System.out.println("a<b");
        }
    }
}
