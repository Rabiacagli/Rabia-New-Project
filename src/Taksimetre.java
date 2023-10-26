import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        double mesafe, toplamtutar;
        Scanner input= new Scanner(System.in);

        System.out.print("Mesafeyi Giriniz: ");

        mesafe= input.nextDouble();

        toplamtutar = (mesafe*2.20) + 10 ;

        if(toplamtutar<20){

        System.out.println(" Toplam Tutar: 20 TL" );

         } else {

        System.out.println("Toplam Tutar : " + toplamtutar);
        }
}
}