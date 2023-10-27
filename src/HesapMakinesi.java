import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner input= new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        n1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.println("İşleminizin sonucu: " + (n1+n2) );
                break;

            case 2:
                System.out.println("İşleminizin sonucu: " + (n1-n2) );
                break;

            case 3:
                System.out.println("İşleminizin sonucu: " + (n1*n2) );
                break;

            case 4:
                if(n1==0){
                    System.out.println("İşleminizin sonucu tanımsız. " );

                }else {
                    System.out.println("İşleminizin sonucu: " + (n1/n2) );
                }
                break;

            default:
                System.out.println("Hatalı giriş yaptınız!! ");
        }


    }
}
