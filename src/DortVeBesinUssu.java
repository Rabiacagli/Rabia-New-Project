import java.util.Scanner;
public class DortVeBesinUssu {
    public static void main(String[] args) {
        int number;

        Scanner inp = new Scanner(System.in);
        System.out.print("Sınır Sayısını Giriniz: ");
        number = inp.nextInt();

        System.out.print("4'ün Kuvvetleri: ");

        for (int i = 1; i <= number; i *= 4) {

            System.out.print(i + ",");
        }
        System.out.println();
        System.out.println("----------------");
        System.out.print("5'in Kuvvetleri: ");
        for (int i = 1; i <= number; i *= 5) {

            System.out.print(i + ",");

        }
    }
}