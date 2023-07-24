package ua.hillel.Hadetskyi.lessons.lesson7;

public class Main {
    public static void main(String[] args) {

        /*int[] array = new int[5];

        System.out.println(array.length);
        array[0] = 3;
        System.out.println(array[0]);



        int[] array = {1, 2, 3, 4, 5};
        int[] array2 = new int[]{1, 2, 3, 4, 5};

         int[] array = new int[20];

        for (int i = 0; i < array.length ; i++) {
            array[i] = i;
            System.out.println(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 5 || array[i] == 9 || array[i] == 10){
                array[i] = 65;
            }
            System.out.println(array[i]);
        }


        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);

        }

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1){
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }

        }



      //  int[] people = new int[10];
        int[] people = {11, 44, 98, 44, 22, 33, 55, 22, 98, 6};

       // for (int i = 0; i < people.length; i++) {
        //
        //            people[i] = (int) (Math.random() * 101);
        //
        //        }
        int max = people[0];

        for (int i = 0; i < people.length; i++) {
            if (max < people[i]){
                max = people[i];
            }
        }

        for (int i = 0; i < people.length; i++) {
            if (people[i] == max) {
                System.out.println("max chance: " + max + " index: " + i);

            }

        }

         */

        int[] team = new int[10];
        for (int i = 0; i < team.length; i++) {
            team[i] = (int) (Math.random() * 11);

        }

        int sumTeamMain = 0;
        int sumTeamReserv = 0;
        for (int i = 0; i < team.length; i += 2) {
            sumTeamMain += team[i];
        }

        for (int i = 1; i < team.length; i += 2) {
            sumTeamReserv += team[i];
        }

        System.out.println("Main = " + sumTeamMain);
        System.out.println("Reserv: " + sumTeamReserv);




        }
    }

