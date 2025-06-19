package homework_6.myATM;

import java.util.Random;
import java.util.Scanner;

public class MyHomework {
    public static void main(String[] args) {

        CreditCard();
    }
    public static Scanner getInput() {
        return new Scanner(System.in);
    }
    public static long random(){
        Random random = new Random();
        long numCard = random.nextLong(623242455255l,9232323232324l);
        return numCard ;
    }
    public static void CreditCard(){
        CreditCard firstPerson = new CreditCard("Vlad",random(), (long) (Math.random()*10000));
        System.out.printf(firstPerson.getCreditCardInformation());
        System.out.print("Please, enter how much do you want to put in : ");
        firstPerson.addMoney(getInput().nextLong());
        System.out.println("****************************************************************");

        CreditCard secondPerson = new CreditCard("Lisa", random(), (long) (Math.random()*10000));
        System.out.printf(secondPerson.getCreditCardInformation());
        System.out.print("Please, enter how much do you want to put in : ");
        secondPerson.addMoney(getInput().nextLong());
        System.out.println("****************************************************************");

        CreditCard thirdPerson = new CreditCard("Dima", random(), (long) (Math.random()*10000));
        System.out.printf(thirdPerson.getCreditCardInformation());
        System.out.print("Please, enter how much do you want to withdraw :");
        thirdPerson.takeMoney(getInput().nextLong());
        System.out.println("*****************************************************************");
        System.out.println(firstPerson.getCreditCardInformation());
        System.out.println(secondPerson.getCreditCardInformation());
        System.out.printf(thirdPerson.getCreditCardInformation());
    }

}
