import java.util.Scanner;
public class DonguW {
    public static void main(String[] args) {
        int r;

        Scanner inp= new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        r = inp.nextInt();

        //while (i<=r){
        for (int i =1; i<=r ; i++){
            if(i % 2 ==0){
                System.out.println(i);
        //i++
            }

        }
    }
}
