import java.util.Scanner;
public class SifreDongu {
    public static void main(String[] args) {
        int sifre;
        boolean sifreDurumu = false;

        Scanner input = new Scanner(System.in);

        while (!sifreDurumu) {
            System.out.println("Şifre Giriniz: ");
            sifre = input.nextInt();
            if (sifre == 1234) {
                System.out.println("Doğru");
                sifreDurumu = true;
            } else {
                System.out.println("Yanlış");

                while (sifreDurumu) {
                    System.out.println("Girdiğiniz şifre eskisiyle aynı olamaz. Yeni şifre belirleyin:");
                    if (sifre == 1234) {
                        System.out.println("Yanlış");
                        sifreDurumu = false;
                    } else {
                        System.out.println("Yeni şifre oluşturuldu.");
                    }

                }

            }

        }

    }
}