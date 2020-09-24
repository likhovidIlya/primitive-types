package com.company;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = "";
        String result = "";
        while (true) {
            System.out.println("Введите ASCII код (end для вывода результата):");
            input = scanner.nextLine();
            if ("end".equals(input)) {
                System.out.println(result);
                break;
            }
            int value = Integer.parseInt(input, 8);
            char c = (char) value;
            String line = Character.toString(c);
            result += line;
        }
    }
}