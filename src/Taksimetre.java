import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {

        // Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
        //
        //Taksimetre KM başına 2.20 TL tutmaktadır.
        //Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        //Taksimetre açılış ücreti 10 TL'dir.


        int km;
        double perKm = 2.20 , toplamtutar, startPrice = 10 ;

        // Scanner sınıfı oluşturuyoruz
        Scanner input= new Scanner(System.in);
        System.out.print("Mesafeyi Giriniz: ");

        toplamtutar = km * perKm;
        toplamtutar += startPrice;

        toplamtutar = ( toplamtutar < 20) ? 20 : toplamtutar;

        System.out.println("Toplam Tutar: " + toplamtutar "Tl");
    }
}