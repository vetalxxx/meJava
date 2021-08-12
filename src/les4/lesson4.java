package les4;

import java.util.Random;
import java.util.Scanner;

public class lesson4 {
    public static final char empty = '.';
    public static final char X = 'X';
    public static final char O = 'O';
    public static char[][] map;
    public static final int size = 5;

    public static void main(String[] args) {
        map();
        prMap();
        while (true) {
            human();
            prMap();
            if (full()) {
                System.out.println("Ничья");
                break;
            }
            if (winnerGorizont(X)) {
                System.out.println("Победил человек");
                break;
            }
            if (winner(X)) {
                System.out.println("Победил человек");
                break;
            }
            comp();
            prMap();
            if (full()) {
                System.out.println("Ничья");
                break;
            }
            if (winnerGorizont(O)) {
                System.out.println("Победил компьютер");
                break;
            }
            if (winner(O)) {
                System.out.println("Победил компьютер");
                break;
            }

        }

    }

    public static void map() {
        map = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map[i][j]=empty;
            }
        }
    }

    public static void prMap() {
        for (int i = 0; i <= size; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print((i+1) + " ");
            for (int j = 0; j <size; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void human() {
        int x;
        int y;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введи кординаты в формате X и Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!examination(x,y));
        map[y][x] = X;
    }

    public static void comp() {
        int x;
        int y;
        Random random = new Random();
        do {
            x = random.nextInt(size);
            y = random.nextInt(size);
        } while (!examination(x,y));
        System.out.println("Комп сходил в " + (x+1) + " " + (y+1));
        map[y][x] = O;
    }

    public static boolean examination(int x, int y) {
        if (x < 0 || x >= size || y < 0 || y >= size) {
            return false;
        }
        if (map[y][x] == empty) {
            return true;
        }
        return false;
    }

    public static boolean winner (char sybm) {
        for (int i = 0; i < size; i++)
        {
            int horizontal = 0;
            int vertical = 0;

            for (int j = 0; j < size; j++)
            {
                // проверка горизонтали
                if (map[i][j] == sybm)
                {
                    horizontal++;
                }
                else
                {
                    horizontal = 0;
                }

                // проверка вертикали
                if (map[j][i] == sybm)
                {
                    vertical++;
                }
                else
                {
                    vertical = 0;
                }
                // проверка горизонтали


            }

            if ((horizontal == size) || (vertical == size) )
            {
                return true;
            }
        }
        return false;
        }

    public static boolean winnerGorizont(char sybm) {
        int gorizontLeft = 0;
        int gorizontRight =0;
        for (int i = 0; i < size; i++)
        {
            if (map[i][i] == sybm)
            {
                gorizontLeft++;
            }
            else
            {
                gorizontLeft = 0;
            }

            // проверка побочной диагонали
            if (map[i][map.length - 1 - i] == sybm)
            {
                gorizontRight++;
            }
            else
            {
                gorizontRight = 0;
            }
            if ((gorizontLeft == size) || (gorizontRight == size) )
            {
                return true;
            }
        }
        return false;
    }



    public static boolean full() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (map[i][j] == empty) {
                    return false;
                }
            }
        }
        return true;
    }
}

