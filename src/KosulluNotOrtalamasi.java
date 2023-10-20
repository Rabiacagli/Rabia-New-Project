import java.util.Scanner;
public class KosulluNotOrtalamasi {
    public static void main(String[] args) {
        int turkce,fizik,mat;
        Scanner input = new Scanner(System.in);
        System.out.println("Türkçe notunuzu girin:" );
        turkce= input.nextInt();
        System.out.println("Fizik notunuzu girin:" );
        fizik= input.nextInt();
        System.out.println("Matematik notunuzu girin:" );
        mat= input.nextInt();
        int toplam= turkce+fizik+mat;
        double sonuc= (toplam/3.0);
        System.out.println("Not Ortalamanız:" + sonuc);
        boolean sonuc2= sonuc>50;
        String str= sonuc2? "Geçtiniz" : "Kaldınız";
        System.out.println(str);



    }
}
