import java.util.Scanner;
public class UsluSayilar {
    public static void main(String[] args) {
        Scanner inp=(new Scanner(System.in));

        int taban, us;
        int toplam=1;

        System.out.print("Taban Sayısını Giriniz: ");
        taban = inp.nextInt();

        System.out.print("Üs Sayısını Giriniz: ");
        us = inp.nextInt();

        for(int i= 1; i <= us; i++ ){
            toplam *= taban;


        }
        System.out.println("Sonuç: " + toplam);
    }
}
