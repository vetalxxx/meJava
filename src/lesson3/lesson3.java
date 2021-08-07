package lesson3;

import java.util.Arrays;
import java.util.Random;

public class lesson3 {
//    Задать целочисленный массив, состоящий из элементов 0 и 1.
//    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//    С помощью цикла и условия заменить 0 на 1, 1 на 0;

    public static void main(String[] args) {
        // зд 1
        System.out.println("Задание номер 1");
        Random ran = new Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(2); //заполним массив случайно числами 0 и 1
        }
        int[] arr1 = arr;                           // запишем наш массив, для того чтобы сделать в нем замену
        System.out.println("Начальный результат");  // можно конечно было не создавать новый массив, вывести значение
        System.out.println(Arrays.toString(arr));   // нашего массива на печать, а потом его и поменять
        for (int j = 0; j < arr1.length; j++) {      // но так тренироваться интереснее))
            if (arr1[j] == 0) {
                arr1[j] = 1;
            } else {
                arr1[j] = 0;
            }
        }
        System.out.println("Конечный результат");
        System.out.println(Arrays.toString(arr1));

        // зд 2
        System.out.println("Задание номер 2");
        int[] arr2 = new int[100];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr2));

        //зд 3
        System.out.println("Задание номер 3");
        int[] arr3 = new int[12];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = ran.nextInt(12); //заполним массив случайно числами 0 и 11
        }
        System.out.println("Начальный результат");
        System.out.println(Arrays.toString(arr3));
        for (int j = 0; j < arr3.length; j++) {          //тут уже второй массив не создавал
            if (arr3[j] < 6) {
                arr3[j] = arr3[j] * 2;    //написал все в одном
            }                                       // при таком моем варианте? можно в один цикл все положить
        }                                               // но тогда не смогу вывести первоначальный результат))
        System.out.println("Конечный результат");       // поэтому пусть пока будет два цикла
        System.out.println(Arrays.toString(arr3));

        // зд 4
        System.out.println("Задание номер 4");
        int[][] arr4 = new int[6][6];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                if (arr4[i]==arr4[j]) {arr4[i][j]=1;
                }
                System.out.print(arr4[i][j]+ " ");
            }
            System.out.println();
        }
        // зд 6
        System.out.println("Задание номер 6");
        int[] arr6 = {9,2,3,44,5,6,8,9,10};
        int max = 0;
        int min = 0;
        for (int i = 0; i < arr6.length; i++) {
            if (arr6[i] > max) {
                max = arr6[i]; min = arr6[i];
            }
        }
        for (int i = 0; i < arr6.length; i++) {
            if (arr6[i] < min) {
                min = arr6[i];
            }
        }
        System.out.println(max + " -" + "Это наибольший элемент");
        System.out.println(min + " -" + "Это наименьший элемент");
        // зд 5
        System.out.println("Задание номер 5");
        System.out.println(Arrays.toString(twoArg(12,7))); // входные данные для зд 5
    }

    public static int[] twoArg(int len, int initialValue) {
        int[] arr5 = new int[len];
        Arrays.fill(arr5, initialValue);
        return arr5;
    }
    // зд номер 7 не смог придумать логику сравнения(а она оказалась проще простого), посмотрел разбор зд и понял что с чем сравнивать))))
    // ну и 8 тоже не смог, самое сложное догадаться как нужно действовать))
}







