package ua.hillel.Hadetskyi.lessons.lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            String str1 = "Hello";
            String str2 = "Hello";
            String str3 = new String("Hello");

        System.out.println(str1 == str2);
        System.out.println(str1 == str2);// порівнюється посилання на хіп

        System.out.println(str1.equals(str3));//порівнюється значення змінної String

        int a = 10;
        int b = 15;
        int c = 20;

        System.out.println(a < b && b  > c);

        if (5 < 4){
            System.out.println("dsaf");
        } else {
            System.out.println("false");

        }

        int i = 5;
        if (scanner.hasNextInt()){
            i = scanner.nextInt();
        } else {
            System.out.println("Wrong data");
            System.exit(0);
        }


    }
}
