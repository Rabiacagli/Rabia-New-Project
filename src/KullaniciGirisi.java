import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        String kullaniciAdi, sifre, degistir, yenisifre ;


        Scanner girdi=new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Giriniz: ");
        kullaniciAdi= girdi.nextLine();

        System.out.print("Şifrenizi Giriniz: ");
        sifre= girdi.nextLine();

        if(kullaniciAdi.equals("patika") && sifre.equals("patika1234")){

            System.out.println("Giriş Başarılı! ");

        }else if(!sifre.equals("patika1234") && (kullaniciAdi.equals("patika"))) {

            System.out.println("Şifre Hatalı! Yeni bir şifre oluşturmak için 1'i tuşlayınız. ");

            degistir = girdi.nextLine();

            switch (degistir) {

                case "1":
                    System.out.print("Yeni parolanızı giriniz: ");
                    yenisifre = girdi.nextLine();

                    if (yenisifre.equals(("patika1234"))) {
                        System.out.println("Şifre oluşturulamadı. Yeniden deneyiniz!" );

                    } else if (!yenisifre.equals("patika1234")) {
                        System.out.println("Yeni şifre oluşturuldu.");
                    }

                    break;

                case "2":
                    System.out.println("Tekrar deneyiniz!!");

            }

        }else {
                        System.out.println("Bilgilerinizi Kontrol ediniz.");


            }



        }

        }




