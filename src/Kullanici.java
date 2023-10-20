import java.util.Scanner;
public class Kullanici {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int a,b;
        System.out.println(" a sayısını giriniz: ");
        a= input.nextInt();
        System.out.println(" b sayısını giriniz: ");
        b= input.nextInt();
        boolean sonuc= a>=b;
        String str = sonuc ? "doğru" : "değil";
        System.out.println(str);
    }

}
