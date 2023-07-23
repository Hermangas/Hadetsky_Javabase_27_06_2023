package ua.hillel.Hadetskyi.lessons.lesson6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    /*    int i = 0;

        for (i = 0; i < 10; i++) {

            if (i == 3 || i == 9) {
                continue;
            }

            System.out.println(i);


        int j = 10;
        for (int i = 0; i < 10 && j > 5; i++, j--) {

            System.out.println("i = " + i);
            System.out.println("j = " + j);
            System.out.println();



        for (int i = 0; i <= 100 ; i++) {
            if ( i % 2 == 0){
                System.out.println(i);
            }

        }




        int num1 = 1;
        int num2 = 1;

        int sum;

        System.out.print(num1 + " " + num2 + " ");

        for (int i = 0; i < 9; i++) {
            sum = num1 + num2;
            System.out.print(sum + " ");

            num1 = num2;
            num2 = sum;


        }

     */
        Scanner scanner = new Scanner(System.in);

        int userValue = -1;

           while (true) {
               System.out.println("Please enter integer from 10 to 50: ");
               if (scanner.hasNextInt()) {
                   userValue = scanner.nextInt();
                   if (userValue >=10 && userValue <=50 ){
                       break;
                   } else {
                       System.out.println("FROM 10 TO 50!!!!!!!");
                       scanner.nextLine();
                   }

                   } else {
                   System.out.println("Wrong data, try again");

               }
               scanner.nextLine();

               }
        System.out.println("userValue: " + userValue);
           }
        }




