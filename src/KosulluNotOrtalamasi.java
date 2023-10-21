import java.util.Scanner;
public class KosulluNotOrtalamasi {
    public static void main(String[] args) {
        int turkce,fizik,mat;
        Scanner input = new Scanner(System.in);
        System.out.print("Türkçe notunuzu girin:" );
        turkce= input.nextInt();
        System.out.print("Fizik notunuzu girin:" );
        fizik= input.nextInt();
        System.out.print("Matematik notunuzu girin:" );
        mat= input.nextInt();
        int toplam= turkce+fizik+mat;
        double sonuc= (toplam/3.0);
        System.out.println("Not Ortalamanız:" + sonuc);
        String sonuc2= sonuc>=50 ? "Geçtiniz" : "Kaldınız";
        System.out.println(sonuc2);



    }
}
