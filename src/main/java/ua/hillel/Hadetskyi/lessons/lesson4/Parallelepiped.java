package ua.hillel.Hadetskyi.lessons.lesson4;

public class Parallelepiped {
    public static void main(String[] args) {

        int width = 10;
        int lenght = 8;
        int height = 7;

        int volume = width * lenght * height;
        System.out.println("Об'єм паралелепіпеда = " + volume);

        int amounLenght = (width + lenght + height) * 4;

        System.out.println(amounLenght);

    }
}
