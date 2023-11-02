import java.util.Scanner;
public class UcVeDordeBolunebilenSayilar {
    public static void main(String[] args) {

        int r;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        r = input.nextInt();

        for ( int i = 0 ; i <= r ; i++ ){
            if ( i % 3 == 0 && i % 4 == 0){

                    System.out.print(i + ",");
                }
            }

        }

    }




