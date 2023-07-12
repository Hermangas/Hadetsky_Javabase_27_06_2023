package ua.hillel.Hadetskyi.lessons.lesson4;

public class LinMin {
    public static void main(String[] args) {

        int warriorLin = 13;
        int shooterLin = 24;
        int horseriderLin = 46;

        int linAmount = 860;

        int linAttack = (warriorLin + shooterLin + horseriderLin) * linAmount;

        int warriorMin = 9;
        int shooterMin = 35;
        int horseriderMin = 12;

        double advantage = 1.5 * linAmount;

        int minAttack = (int) ((warriorMin + shooterMin + horseriderMin) * advantage);


        System.out.println("Загальна атака Лі: " + linAttack );
        System.out.println("Загальна атака Мінь: " + minAttack);

    }
}
