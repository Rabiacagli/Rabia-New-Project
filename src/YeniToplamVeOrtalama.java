import java.util.Scanner;

//Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları topla
public class YeniToplamVeOrtalama {
    public static void main(String[] args) {
        int n;
        int i = 0;
        int total = 0;


        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayı giriniz: ");
            n = input.nextInt();

            if (n % 2 == 0 && n % 4 == 0) {
                total += n;
                i++;
            }


        } while (n % 2 == 0);
        System.out.println("Çift ve 4'e Bölünebilen Sayıların Ortalaması:  " + total / i);
    }
}
