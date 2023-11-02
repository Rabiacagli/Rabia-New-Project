import java.util.Scanner;
public class KombinasyonHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        //  n! / (r! * (n-r)!)

        int n;
        int r;
        int nFakt = 1;
        int rFakt = 1;
        int nEksirFakt = 1;


        System.out.print("n Sayısını Giriniz: ");
        n= inp.nextInt();

        System.out.print("r Sayısını Giriniz: ");
        r= inp.nextInt();

        for (int i = 1; i <= n; i++ ){
            nFakt *= i;

        }
        for (int i=1; i <= r; i++){
            rFakt *= i;
        }
        for (int i=1; i <= (n-r); i++ ){
            nEksirFakt *= i;
        }
        int kombinasyon = nFakt / (rFakt * nEksirFakt);

        System.out.println("C(n,r) = " + kombinasyon);


    }
}
