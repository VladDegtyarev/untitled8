package homework_10;

import java.util.Scanner;

public class MyHomework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the name document :");
        String nameDoc = input.nextLine();
        System.out.println("your doc : " + nameDoc);
        printBlocks(nameDoc);
        changeName(nameDoc);
        printLowerLetters(nameDoc);
        printUpperLetters(nameDoc);
        checkABC(nameDoc);
        check555(nameDoc);
        check1a2b(nameDoc);
    }

    public static void printBlocks(String docName) {
        String[] blocks = docName.split("-");
        if (blocks.length >= 2) {
            System.out.println(blocks[0] + "-" + blocks[1]);
        }
    }

    public static void changeName(String docName) {
        String maskedNumber = docName.replaceAll("-[A-Za-z]{3}", "-***");
        System.out.println(maskedNumber);
    }

    public static void printLowerLetters(String docName) {
        String[] blocks = docName.split("-");
        StringBuilder letters = new StringBuilder();

        for (String block : blocks) {
            for (char ch : block.toCharArray()) {
                if (Character.isLetter(ch)) {
                    letters.append(Character.toLowerCase(ch)).append("/");
                }
            }
        }

        if (letters.length() > 0) {
            letters.setLength(letters.length() - 1);
        }
        System.out.println(letters);
    }

    public static void printUpperLetters(String docName) {
        StringBuilder upperCaseLetters = new StringBuilder("Letters:");
        String[] blocks = docName.split("-");

        for (String block : blocks) {
            for (char ch : block.toCharArray()) {
                if (Character.isLetter(ch)) {
                    upperCaseLetters.append(Character.toUpperCase(ch)).append("/");
                }
            }
        }

        if (upperCaseLetters.length() > 8) {
            upperCaseLetters.setLength(upperCaseLetters.length() - 1);
        }
        System.out.println(upperCaseLetters);
    }

    public static void checkABC(String docName) {
        if (docName.toLowerCase().contains("abc")) {
            System.out.println("The document number contains  abc .");
        } else {
            System.out.println("The document number does not contain abc .");
        }
    }

    public static void check555(String docName) {
        if (docName.startsWith("555")) {
            System.out.println("Document number starts with 555.");
        } else {
            System.out.println("The document number does not start with 555.");
        }
    }

    public static void check1a2b(String docName) {
        if (docName.endsWith("1a2b")) {
            System.out.println("The document number ends with 1a2b.");
        } else {
            System.out.println("The document number does not end with 1a2b.");
        }
    }
}