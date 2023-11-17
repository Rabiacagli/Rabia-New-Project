import java.util.Scanner;
public class EbobEkokHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,n2;
        int i = 1;
        int ebob = 1;

        System.out.print("a sayısını giriniz: ");
        n1 = input.nextInt();

        System.out.print("b sayısını giriniz: ");
        n2 =  input.nextInt();

        if(n1 <= n2) {
            while (i <= n1) {

                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
                i++;
            }
            System.out.println("Girilen sayıların Ebobu: " + ebob);
            System.out.println("Girilen sayıların Ekoku: " + (n1*n2)/ebob);

        } else {
            while (i <= n2) {
                if (n1 % i ==0 && n2 % i ==0) {
                    ebob=i;
                }
                i++;
            }
            System.out.println("Girilen sayıların Ebobu: " + ebob);
            System.out.println("Girilen sayıların Ekoku: " + (n1*n2)/ebob);
        }

    }
}