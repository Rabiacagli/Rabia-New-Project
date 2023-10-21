import java.util.Scanner;
public class Kdv2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Tutarı Giriniz: ");
        double tutar= input.nextDouble();
        double kdvliTutar=tutar<1000 ? tutar+(tutar*0.20) : tutar+(tutar*0.08);
        System.out.println("Kdv dahil tutar: " + kdvliTutar);
    }
}
