import java.util.Scanner;
public class SayilariSiralama {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int a, b, c ;

        System.out.print("A sayısını giriniz: ");
        a = input.nextInt();

        System.out.print("B sayısını giriniz: ");
        b = input.nextInt();

        System.out.print("C sayısını giriniz: ");
        c = input.nextInt();

        if(a>b && a>c){
            if(b>c){
                System.out.println("a>b>c");
            }else {
                System.out.println("a>c>b");
            }
        } else if (b>a && b>c) {
            if (a>c){
                System.out.println("b>a>c");
            }else {
                System.out.println("b>c>a");
            }

        } else if (c>b && c>a) {
            if (b>a){
                System.out.println("c>b>a");
            }else {
                System.out.println("c>a>b");
            }

        }
    }
}
