import java.util.Scanner;

public class ManavKasap {
    public static void main(String[] args) {

        double armut, elma, domates, muz, patlican ;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kilo? : ");

        armut= input.nextDouble();

        System.out.print("Elma kaç kilo?: ");

        elma= input.nextDouble();

        System.out.print("Domates kaç kilo?: ");

        domates= input.nextDouble();

        System.out.print("Muz kaç kilo?: ");

        muz= input.nextDouble();

        System.out.print("Patlıcan kaç kilo?: ");

        patlican= input.nextDouble();

        double toplam = (armut*22.22) + (elma*13.67) + (domates*11.11) + (muz*19.95) + (patlican*15.00);

        System.out.println("Toplam Tutar:" + toplam + "TL");


    }
}
