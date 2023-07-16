package ua.hillel.Hadetskyi.lessons.lesson5;

import java.util.Scanner;

public class CountreStrike {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            System.out.print("Name of the first team: ");
            String teamName1 = scanner.nextLine();


        System.out.print("1 player kills: ");
        byte player1Team1 = scanner.nextByte();
        System.out.print("2 player kills: ");
        byte player2Team1 = scanner.nextByte();
        System.out.print("3 player kills: ");
        byte player3Team1 = scanner.nextByte();
        System.out.print("4 player kills: ");
        byte player4Team1 = scanner.nextByte();
        System.out.print("5 player kills: ");
        byte player5Team1 = scanner.nextByte();

        System.out.print("Name of the second team: ");
        String teamName2 = scanner.nextLine();
        teamName2 = scanner.nextLine();

        System.out.print("1 player kills: ");
        byte player1Team2 = scanner.nextByte();
        System.out.print("2 player kills: ");
        byte player2Team2 = scanner.nextByte();
        System.out.print("3 player kills: ");
        byte player3Team2 = scanner.nextByte();
        System.out.print("4 player kills: ");
        byte player4Team2 = scanner.nextByte();
        System.out.print("5 player kills: ");
        byte player5Team2 = scanner.nextByte();



        int resultTeam1 = (player1Team1 + player2Team1 + player3Team1 + player4Team1 + player5Team1) / 5;

        int resultTeam2 = (player1Team2 + player2Team2 + player3Team2 + player4Team2 + player5Team2) / 5;

        if (resultTeam1 > resultTeam2) {
            System.out.print("Перемогла команда " + teamName1 + " набрала " + resultTeam1 + " очків");
        } else {
            System.out.print("Перемогла команда " + teamName2 + " набрала " + resultTeam2 + " очків");
        }



        }
}
