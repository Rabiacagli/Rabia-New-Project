import java.util.Scanner;
public class YakitHesaplama {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi Giriniz: ");

        double mesafe = input.nextDouble();

        System.out.print("Klima açıksa 1 Klima Kapalı ise 2 : ");

        int klima= input.nextInt();

    double toplamyakit = mesafe * 0.07 ;
    double klimaliyakit = mesafe * 0.1 ;

    if (klima == 1) {
        System.out.println("Toplam yakıt tüketiminiz: " + (klimaliyakit + 0.5) + " Litre");

    } else {
        System.out.println("Toplam yakıt tüketiminiz: " + (toplamyakit + 0.5) + " Litre");
    }

    }
}
