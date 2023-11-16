public class ForDeneme {
    public static void main(String[] args) {
        int sayac = 1;
        for(int i = 1; i <= 5; i++){
            for(int r = 1; r <= 3; r++){
                for(int m = 1; m <= 2; m++) {

                    System.out.println(sayac);
                    sayac++;
                }
            }
            System.out.println("İ nin "+ i+"." +"döngüsü tamamlandı!");
        }
    }
}
