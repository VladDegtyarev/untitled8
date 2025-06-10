package homework_3;

import java.util.Scanner;

public class MyHomework {
    public static void main(String[]args){
calculateDescending();

    }

    public static void useSwitch(){
        //1. Написать программу для вывода названия поры года по номеру
        //месяца.
        System.out.print("Please,enter the Month number :");
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        switch (month){
            case 1,2,12:
                System.out.println("Winter");
                break;
            case 3,4,5 :
                System.out.println("Spring");
                break;
            case 6,7,8 :
                System.out.println("Summer");
                break;
            case 9,10,11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("There is no such month");

        }
    }
    public static void useIf(){
        //2. Написать программу для вывода названия поры года по номеру месяца.
        //При решении используйте оператор if-else-if.
        System.out.print("Please,enter thr Month number: ");
        Scanner input = new Scanner(System.in);
        int month= input.nextInt();
        if (month==1||month==2||month==12){
            System.out.println("Winter");
        } else if (month==3||month==4||month==5) {
            System.out.println("Spring");
        } else if (month==6||month==7||month==8) {
            System.out.println("Summer");
        } else if (month==9||month==10||month==11) {
            System.out.println("Fall");
        }
        else {
            System.out.println("There is no such month");
        }
    }
    public static void calculateOdd(){
        //3. Напишите программу, которая будет
        // принимать на вход число и на выход будет выводить сообщение четное число или нет.
        //Для определения четности числа используйте операцию получения остатка от деления операция выглядит так: '% 2').
        System.out.print("Please, enter the number: ");
        Scanner input= new Scanner(System.in);
        int number = input.nextInt();
        if(number%2==0){
            System.out.println("This is Even number");
        } else if (number % 2 != 0){
            System.out.println("This is Odd number");
        }
        }
    public static void outsideTemperature(){
        //4. Для введенного числа t (температура на улице) вывести Если >-5, то вывести «Тепло».
        //Если -5>=t> -20, то вывести «Нормально».
        //Если -20>= 1, то вывести «Холодно».
        System.out.print("Please, enter the outside temperature: ");
        Scanner input = new Scanner(System.in);
        double t = input.nextDouble();
        if (t>-5){
            System.out.println("Today is warm!");
    } else if (-5>=t&& t>-20) {
            System.out.println("Today is normal!");
        } else if (-20>t) {
            System.out.println("Today is cold!");
            
        }
    }
    public static void makeRainbow(){
//5. По введенному номеру определить цвет радуги
        System.out.print("Please ,enter the color number :");
        Scanner input= new Scanner(System.in);
        int color = input.nextInt();
        if (color == 1) {
            System.out.println("Red");
        } else if (color == 2) {
            System.out.println("Orange");
        } else if (color == 3) {
            System.out.println("Green");
        } else if (color == 4) {
            System.out.println("Light blue");
        } else if (color == 5) {
            System.out.println("Blue");
        } else if (color == 6) {
            System.out.println("Violet");
        } else {
            System.out.println("There is no such color in the rainbow");
        }
    }
    public static void useFor(){
        //При помощи цикла for вывести на экран нечетные числа от 1 до 99.
        // При решении используйте операцию инкремента (++).
        for(int value=1;value<=99;value++){
            if(value%2==0){
                continue;
            }
            System.out.println(value);
        }

    }
    public static void calculateDescending(){
        //Необходимо вывести на экран числа от 5 до 1.
        //При решении используйте операцию декремента (--)
        for (int value= 5;value!=0;value--){
            System.out.println(value);
        }
    }
    public static void calculateOrder() {
        //Напишите программу, где пользователь вводит любое целое положительное число. А
        //программа суммирует все числа от 1 до введенного пользователем числа.
        System.out.print("Please,enter the number :");
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        for (int counter = 1 ;counter<=value ; counter++) {

            System.out.println(counter);
        }
    }
    public static void useWhile(){
        //Необходимо, чтоб программа выводила на экран вот такую последовательность:
        //7 14 21 28 35 42 49 56 63 70 77 84 91 98.
        //В решении используйте цикл while.
        int counter =1;
        while (counter<=14){
            System.out.println(counter *7);
            counter++;
        }

    }

    public static void  printSequence(){
        //Вывести 10 первых чисел последовательности 0, -5,-10,-15..
        int value = 0;
        while (value<=10){
            System.out.println(value*-5);
            value++;
        }
    }
    public static void printSquare() {
        //Составить программу выводящую на экран квадраты чисел от 10 до 20
        for (int value = 10; value <= 20; value++) {
            System.out.println(value * value);
        }
    }
    public static void interestCalculation() {
        System.out.print("Please, enter the Sum:");
        Scanner input= new Scanner(System.in);
        float sum=input.nextFloat();
        System.out.print("Please ,enter the month numbers:");
        int month = input.nextInt();
        for(float value=(float)(sum*(0.07*(float)month)); ;){
            System.out.println("You will get :"+(value+sum));
            break;
        }
        }







}











