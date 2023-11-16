import java.util.Scanner;
public class YildizlarIleElmasYapimi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int a = inp.nextInt();

        for (int i = 1; i <= a; i++) {

            for (int b = 1; b <= a - i; b++) {
                System.out.print(" ");

            }
            for (int c = 1; c <= (2 * i) - 1; c++) {

                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i <= a ; i++){
            for(int b = 1 ; b <= i; b++){
                System.out.print(" ");
            }
            for (int c =2; c <= 2*(a-i); c++){
                System.out.print("*");
            }
            System.out.println();

        } // a= basamak sayısı , b= boşluk sayısı, c= yıldız sayısı

    }

}

