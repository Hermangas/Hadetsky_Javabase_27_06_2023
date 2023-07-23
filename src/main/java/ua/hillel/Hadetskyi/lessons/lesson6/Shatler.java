package ua.hillel.Hadetskyi.lessons.lesson6;

public class Shatler {
    public static void main(String[] args) {

        int counter = 0;
        int maxCounter = 100;
        int i = 0;
        String shalter = "Shalter";


        for (i = 0;; i++) {

                if (i / 10 == 4 || i / 10 == 9 || i % 10 == 4 || i % 10 == 9) {
                    continue;

                }

                System.out.println(shalter + i);
                counter++;

                if (counter == maxCounter){
                    break;
                }




        }



    }
}

