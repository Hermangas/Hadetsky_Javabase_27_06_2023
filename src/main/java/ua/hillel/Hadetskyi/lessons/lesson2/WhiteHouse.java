package ua.hillel.Hadetskyi.lessons.lesson2;

public class WhiteHouse{
    public static void main(String[] args) {

        float latitude = 38.897957F;
        float longitude = -77.036560F;
        char symbol1 = '\u00B0';
        char symbol2 = '\'';
        char symbol3 = '\"';

        System.out.println("Latitude: " + latitude);
        System.out.println("Longitude: " + longitude);
        System.out.println("DMS Lat: 38" + symbol1 + " 53" + symbol2 + " 52.6452" + symbol3 + " N");
        System.out.println("DMS Long: 77" + symbol1 + " 2" + symbol2 + " 11.6160" + symbol3 + " W");


    }
}
