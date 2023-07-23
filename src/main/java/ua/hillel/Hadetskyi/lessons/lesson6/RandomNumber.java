package ua.hillel.Hadetskyi.lessons.lesson6;

import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int maxAttempt = 4;
        int attempt = 0;
        int number;

        int randomNumber = (int) (Math.random() * 10);
        System.out.println(randomNumber);


        while(attempt < maxAttempt) {
            System.out.println("Вгадайте число від 1 до 10: ");
             number = scanner.nextInt();

            if (scanner.hasNextInt()){
                number = scanner.nextInt();
            } else {
                System.out.println("Wrong data");
                System.exit(0);
            }

            if (number == randomNumber){
                System.out.println("Ви вгадали число!!");
                System.exit(0);

            } else {
                attempt++;
                System.out.println("Невірно, спробуйте ще раз: ");
            }

            if (attempt == maxAttempt){
                System.out.println("Ви витратили всі спроби :(");
                System.exit(0);
            }
            
        }


    }
}
