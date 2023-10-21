import java.util.Scanner;
public class Kullanici2 {
     public static void main(String[] args) {

            Scanner input= new Scanner(System.in);
            int a,b;
            System.out.print("a sayısını giriniz: ");
            a= input.nextInt();
            System.out.print("b sayısını giriniz: ");
            b= input.nextInt();
            String sonuc= a>b ? "a sayısı büyüktür b'den": "a sayısı küçüktür b'den";
         System.out.println(sonuc);
        }
}
