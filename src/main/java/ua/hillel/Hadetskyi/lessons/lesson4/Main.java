package ua.hillel.Hadetskyi.lessons.lesson4;

public class Main {
    public static void main(String[] args) {

       /* System.out.println(10 + 5  );

        float f = 12;
        float b = 5;

        System.out.println(2.4 * 5);
        System.out.println(12 % 8);

         f += 5;

        */

        int a = 700;
        int b = 2000;
        int c = 3500;

        int countMounth10Years = 10 * 12;

        int salary1 = a * countMounth10Years;
        int salary2 = b * countMounth10Years;
        int salary3 = c * countMounth10Years;

        System.out.println(salary1);
        System.out.println(salary2);
        System.out.println(salary3);

        double tax = 0.95;

        int salary1WithoutTax = (int) (salary1 * tax);
        int salary2WithoutTax = (int) (salary2 * tax);
        int salary3WithoutTax = (int) (salary3 * tax);

        System.out.println("salary1 without tax = " + salary2);
        System.out.println(Math.abs(-5));

        System.out.println(Math.pow(3.5, 2));// stepen

        System.out.println();
        System.out.println(Math.sqrt(16));// korin

        System.out.println();

        System.out.println(Math.round(10.49999));//okruglenya

        System.out.println();

        System.out.println(Math.min(1, 10));//minimalne chislo

        System.out.println();
        System.out.println(Math.max(10, 100));//maksimalne chislo

        System.out.println(Math.random());//randomne chislo vid 0.0 do 1.0

        System.out.println((int) (15 + Math.random() * 21));//[15 - 21]
    }
}
