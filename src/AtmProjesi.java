import java.util.Scanner;
public class AtmProjesi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;

        while(right > 0){
            System.out.print("Kullanıcı Adınızı Giriniz: ");
            userName = input.nextLine();
            System.out.print("Şifrenizi Giriniz: ");
            password = input.nextLine();

            if( userName.equals("ra") && password.equals("15")){
                System.out.println("RAC Bankasına Hoşgeldiniz ");

                do{
                    System.out.println("=====================");
                    System.out.println("1-Para Yatırma\n"+
                            "2-Para Çekme\n"+
                            "3-Bakiye Sorgulama\n"+
                            "4-Çıkış Yap\n");
                    System.out.print("LÜtfen Yapmak İstediğiniz İşlemi Seçiniz : ");

                    select=input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Yatırmak İstediğiniz Tutarı Giriniz: ");
                            int price = input.nextInt();
                            balance += price;
                            System.out.println("Bakiyeniz: " + balance );
                            break;

                        case 2:
                            System.out.print("Çekmek İstediğiniz Tutarı Giriniz: ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiyeniz Yetersiz.");
                            } else {
                                balance -= price;
                                System.out.println("Kalan Tutar: " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance + "Tl");
                            break;

                    }
                } while(select != 4);
                System.out.println("Tekrar Görüşmek Üzere.");
                break;

            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}