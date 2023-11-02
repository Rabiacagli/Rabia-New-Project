import java.util.Scanner;
public class UcVeDordeBolunebilenSayilar {
    public static void main(String[] args) {
        int i = 0;
        int r;
        int toplam = 0 ;


        Scanner input = new Scanner(System.in);


        do {
            System.out.print("Sayı Giriniz: ");
            r = input.nextInt();
            if (r % 3 == 0 && r % 4 == 0){
                toplam += r;
                i++ ;
            }

        } while (r>0);


        System.out.println( "Toplam: " + toplam/i );
    }
}








