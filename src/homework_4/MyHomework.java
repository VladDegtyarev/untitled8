package homework_4;


import java.util.Arrays;
import java.util.Scanner;

public class MyHomework {
    public static void main(String[] args) {


    }

    public static void basicArray() {
        //1.Создайте массив целых чисел. Напишете программу,
        // которая выводит сообщение о том, входит ли заданное число в массив или нет.
        int[] array = new int[]{4, 51, 3, 8, 42};
        System.out.print("Please, enter the number");
        Scanner input = new Scanner(System.in);
        int search = input.nextInt();
        for (int index=0;index<array.length;index++) {
            if (search==array[index]) {
                System.out.println("The number is included");
            }
            else {
                System.out.println("Not included");
            }
            }
        }
    public static void getArray(){
        //1.Создайте массив целых чисел. Удалите все вхождения заданного числа из массива.
        //Пусть число задается с консоли (класс Scanner). Если такого числа нет - выведите сообщения об этом.
        //В результате должен быть новый массив без указанного числа.
        Scanner input = new Scanner(System.in);
        int []value = new int[]{1,2,3,45,73,12,6};
        System.out.print("Please enter the number :");
        int calculate = input.nextInt();
        int countX = 0;
        for(int el:value){
            if(calculate!=el) {
                countX++;
            }
        }
        int[] newCount = new int[countX];
        int countY=0;
        for (int el:value){
            if (el!=calculate){
                newCount[countY++]=el;
            }
        }
        System.out.println(java.util.Arrays.toString(newCount));
    }
    public static void calculateAvg() {
        //2.Создайте и заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
        //Для генерации случайного числа используйте метод Math.random().
        // Пусть будет возможность создавать массив произвольного размера. Пусть размер массива вводится с консоли.
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter  number of elements for an array :");
        int arrayLength = input.nextInt();
        int[] values = new int[arrayLength];
        for (int index = 0; index < values.length; index++) {
            values[index] = (int) (Math.random() * 10);
        }
        int sum = 0;
        int max = Arrays.stream(values).max().getAsInt();
        int min = Arrays.stream(values).min().getAsInt();

        for (int index = 0; index < values.length; index++) {
            sum = sum + values[index];
        }
        System.out.println("Max number :" + max);
        System.out.println("Min number :" + min);
        System.out.printf("The average sum of values of the elements : %.3f",
                (double) sum / values.length);
    }


    public static void comparisonArray() {
        //Создайте 2 массива из 5 чисел.
        //Выведите массивы на консоль в двух отдельных строках.
        //Посчитайте среднее арифметическое элементов каждого массива и сообщите,
        // для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).
        int[] coordinatesX = new int[]{3, 4, 5, 7, 41};
        int[] coordinatesY = new int[]{7, 1, 9, 5, 99};
        String strX = Arrays.toString(coordinatesX);
        String stry = Arrays.toString((coordinatesY));
        int sumX = 0;
        int sumY = 0;
        System.out.println(strX);
        System.out.println(stry);
        for (int index = 0; index < coordinatesX.length; index++) {
            sumX = sumX + coordinatesX[index];
        }
        System.out.printf("The average sum of values of the elements : %.3f \n",
                (double) sumX / coordinatesX.length);
        for (int index = 0; index < coordinatesY.length; index++) {
            sumY = sumY + coordinatesY[index];
        }
        System.out.printf("The average sum of values of the elements : %.3f\n",
                (double) sumY / coordinatesY.length);
        ;
        if (((double) sumX / coordinatesX.length) > ((double) sumY / coordinatesY.length)) {
            System.out.println("The average sum arrayX>arrayY");
        }
        else if (((double) sumX / coordinatesX.length) < ((double) sumY / coordinatesY.length)) {
            System.out.println("The average sum arrayY>arrayX");


        }
    }

}




































