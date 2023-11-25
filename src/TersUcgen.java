import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int a = input.nextInt();

        for(int i = 1; i <= a ; i++) {
            for (int b = 1; b <= i; b++) {
                System.out.print(" ");
            }
            for (int c = 2; c <= 2 * (a - i); c++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
