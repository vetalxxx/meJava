package lesson5;



import java.util.Scanner;

public class lesson5 {
    public static void main(String[] args) {
        Employee[] arr = {
                new Employee("Иванов", "Семен", "Маркович", 70),
                new Employee("Симонов", "Андрей", "Евграфыч", 20),
                new Employee("Ратуша", "Елисей", "Пифагорович", 50),
                new Employee("Сидоров", "Владимир", "Степанович", 41),
                new Employee("Смирнов", "Инокентий", "Олегович", 40),
        };
        System.out.println("Посмотрим всех сотрудников");
        System.out.println();
        for (int j = 0; j < arr.length; j++) {
            arr[j].people();
        }
        System.out.println();

        System.out.println("Теперь кому больше сорока");
        System.out.println();

        int min = 40;               // это я подглядел ((( именно перебор всех элементов массива
        for (Employee i : arr) {    // думал что можно обычным фором перебрать элементы, но столкнулся с проблемой
            if (i.age > min) {      // что перебрать массив с разными элементами проблематично, или я ошибаюсь?
                i.people();         // так же хотел попробывать заполнить массив сканером, но и тут неудача))
            }                       //


        }

    }
}

