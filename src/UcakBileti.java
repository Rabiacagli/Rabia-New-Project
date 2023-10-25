import java.util.Scanner;
public class UcakBileti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafe(KM):");
        int mesafe = input.nextInt();

        System.out.print("Yaş: ");
        int yas = input.nextInt();

        System.out.print("Yolculuk tipi (1: Tek Yön, 2: Gidiş-Dönüş) : ");
        int yolculukTipi = input.nextInt();

        double biletFiyati = mesafe * 0.10;
        double indirimliFiyat1 = biletFiyati * 0.50;
        double indirimliFiyat2 = biletFiyati * 0.90;
        double indirimliFiyat3 = biletFiyati * 0.70;

        if (yas <= 0 || mesafe <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz! ");
        } else {

            if (yolculukTipi == 1) {

                if (yas < 12) {
                    System.out.println("Bilet Fiyatı: " + indirimliFiyat1 + "TL");
                } else if (yas >= 12 && yas <= 24) {
                    System.out.println("Bilet Fiyatı: " + indirimliFiyat2 + "TL");
                } else if (yas >= 65) {
                    System.out.println("Bilet Fiyatı: " + indirimliFiyat3 + "TL");
                } else {
                    System.out.println("Bilet Fiyatı: " + biletFiyati + "TL");
                }

            } else {
                if (yas < 12) {
                    System.out.println("Bilet Fiyatı: " + 2 * (indirimliFiyat1 * 0.80) + "TL");
                } else if (yas >= 12 && yas <= 24) {
                    System.out.println("Bilet Fiyatı: " + 2*(indirimliFiyat2 * 0.80) + "TL");
                } else if (yas >= 65) {
                    System.out.println("Bilet Fiyatı: " + 2*(indirimliFiyat3 * 0.80) + "TL ");
                } else {
                    System.out.println("Bilet Fiyatı: " + 2*(biletFiyati * 0.80) + "TL");
                }


            }
        }


        }


    }