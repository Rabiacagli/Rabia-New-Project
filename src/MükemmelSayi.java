import java.util.Scanner;
public class MükemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int total = 0;

        System.out.print("Sayı Giriniz: ");
        number = input.nextInt();

        for (int i = 1; i < number ; i++){

            if (number % i == 0) {
            total += i;
            }

        }if (total == number){
            System.out.println("Bu Sayı Mükemmel Sayıdır. ");

        }else {
            System.out.println("Bu Sayı Mükemmel Sayı Değildir. ");
        }
    }
}
