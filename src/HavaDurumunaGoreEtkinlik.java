//Koşullar :
//
//Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
//Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
//Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
//Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

import java.util.Scanner;

public class HavaDurumunaGoreEtkinlik {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Sıcaklık Giriniz: ");

        int sicaklik= input.nextInt();

        if (sicaklik<=5) {
            System.out.println("Kayak Yapabilirsiniz. ");


        } else if (sicaklik>5 && sicaklik<=15) {
            System.out.println("Sinemaya Gidebilirsiniz. ");


        } else if (sicaklik>15 && sicaklik<=25) {
            System.out.println("Piknik Yapabilirsiniz. ");


        }else{
            System.out.println("Yüzebilirsiniz. ");
        }


    }
}

