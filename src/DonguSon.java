import java.util.Scanner;
public class DonguSon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        do {
            System.out.print("Sayı Giriniz: ");
            sayi = input.nextInt();
        } while (sayi > 3);
    }
}