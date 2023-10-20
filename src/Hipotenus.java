import java.util.Scanner;
public class Hipotenus {
    public static void main(String[] args) {
        int kisaKenar, uzunKenar;
        double hipotenus;
        Scanner girdi= new Scanner(System.in);
        System.out.print("Kısa kenarı giriniz: ");
        kisaKenar= girdi.nextInt();
        System.out.print("Uzun Kenarı Giriniz: ");
        uzunKenar= girdi.nextInt();
        hipotenus=Math.sqrt((kisaKenar*kisaKenar)+(uzunKenar*uzunKenar));
        System.out.println("Hipotenüs: " + hipotenus);
    }
}
