public class AsalSayiBulma {
    public static void main(String[] args) {
        int i, j;
        boolean asal;

        System.out.println("1 ile 100 Arasındaki Asal Sayılar: ");
        for(i = 2; i <= 100; i++) {
            asal = true;

            for(j = 2; j < i; j++) {

                if( i % j == 0) {
                    asal = false;
                    break;
                }
            }

            if(asal) {
                System.out.print(i + ",");
            }
        }
    }
}
