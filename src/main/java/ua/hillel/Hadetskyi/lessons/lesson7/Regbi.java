package ua.hillel.Hadetskyi.lessons.lesson7;

import java.util.Arrays;

public class Regbi {
    public static void main(String[] args) {


        int[] team1 = new int[25];
        int[] team2 = new int[25];


        for (int i = 0; i < team1.length; i++) {
            team1[i] = (int)((Math.random() * (41- 18)) + 18 );
        }
        System.out.println("Team1 :");


        for (int i = 0; i < team1.length; i++) {
            if (i == team1.length - 1){
                System.out.print(team1[i] + ".");
            } else {
                System.out.print(team1[i] + ", ");
            }
        }

        for (int i = 0; i < team2.length; i++) {
            team2[i] = (int)((Math.random() * (41- 18)) + 18 );
        }
        System.out.println("");
        System.out.println("Team 2: ");

        for (int i = 0; i < team2.length; i++) {
            if (i == team2.length - 1){
                System.out.print(team2[i] + ".");
            } else {
                System.out.print(team2[i] + ", ");
            }
        }



            int sumTeam1 = Arrays.stream(team1).sum();
        System.out.println("");
        System.out.println("");
            System.out.println("Middle age Team1: " + sumTeam1 / team1.length);

        int sumTeam2 = Arrays.stream(team2).sum();
        System.out.println("");
        System.out.println("Middle age Team2: " + sumTeam2 / team2.length);


        }


    }

