package homework_5;

import java.util.Arrays;
import java.util.Scanner;

public class MyHomework {
    public static void main(String[] args) {


    }

    public static void getThreeDimensionalArray() {
        //Создать трехмерный массив из целых чисел.
        //С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на заданное число.
        // Пусть число, на которое будет увеличиваться каждый элемент, задается из консоли.
        Scanner input = new Scanner(System.in);
        int[][][] value = new int[][][]{
                {{7, 5, 3, 2}
                },
                {
                        {9, 11, 23, 54, 71},
                        {61, 54, 23, 78, 91}
                },
                {
                        {76, 53, 76},
                        {91, 13, 65, 12, 45}
                }
        };
        System.out.println("please enter the number: ");
        int calculate = input.nextInt();

        for (int outer = 0; outer < value.length; outer++) {
            for (int inner = 0; inner < value[outer].length; inner++) {
                for (int inside = 0; inside < value[outer][inner].length; inside++) {
                    value[outer][inner][inside] = value[outer][inner][inside] + calculate;
                    System.out.println(value[outer][inner][inside]);
                }
            }
        }
    }

    public static void getChess() {
        //Создать программу для раскраски шахматной доски с помощью цикла.
        //Создать двумерный массив String'oв 8x8.
        // С помощью циклов задать элементам циклам значения B(Black) или W(White). Результат работы программы:
        String[][] chess = new String[8][8];
        for (int rows = 0; rows < chess.length; rows++) {
            for (int colone = 0; colone < chess[rows].length; colone++) {
                if ((rows + colone) % 2 != 0) {
                    chess[rows][colone] = "B";
                } else {
                    chess[rows][colone] = "W";
                }
                System.out.print(" " + chess[rows][colone] + " ");
            }
            System.out.println();

        }


    }

    public static void multiplyArrays() {
        //Создайте два массива целых чисел размером 3х3 (две матрицы).
        //Напишите программу для умножения двух матриц.
        int[][] one = new int[][]{
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0}
        };
        int[][] two = new int[][]{
                {1, 2, 3},
                {1, 1, 1},
                {0, 0, 0},
                {2, 1, 0}
        };
        int[][] three = new int[3][3];
        for (int rows = 0; rows < one.length; rows++) {
            for (int rowsY = 0; rowsY < two[0].length; rowsY++) {
                for (int colone = 0; colone < one[0].length; colone++) {
                    three[rows][rowsY] += one[rows][colone] * two[colone][rowsY];
                }
                System.out.printf(""+three[rows][rowsY]+"");
            }
            System.out.println();
        }
        }
        public static void sumArray(){
        //Создайте двумерный массив целых чисел. Выведите на консоль сумму всех
            //элементов массива.
            int[][] values = new int[][]{
                    {4, 2, 1, 4},
                    {5, 8, 9, 1},
                    {2, 1, 4}
            };
            int sum = 0;

            for (int rows = 0; rows < values.length; rows++) {
                for (int cols = 0; cols < values[cols].length; cols++) {
                    sum = sum + values[rows][cols];
                }
            }
            System.out.println(sum);
        }


    }



