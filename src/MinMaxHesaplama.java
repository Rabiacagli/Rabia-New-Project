import java.util.Scanner;
public class MinMaxHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int counter, number, min = 0, max = 0;

        System.out.print("Girilecek sayı adedini belirtiniz: ");
        counter = input.nextInt();

        while (counter != 0) {

            System.out.print("Sayıyı giriniz: ");
            number = input.nextInt();
            if (number > max) {
                max = number;

            } else if (number < min)
                min = number;
            counter--;


        }
        System.out.println("En büyük sayı : " + max);
        System.out.println("En küçük sayı : " + min);

    }
}

