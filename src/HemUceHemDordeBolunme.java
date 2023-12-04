public class HemUceHemDordeBolunme {
    public static void main(String[] args) {
        for(int i = 1; i < 50; i++){

            if(i % 3 == 0 && i % 4 == 0 ) { // hem 3'e hem de 4'e bolunme kosulunu kontrol eder.

                System.out.println(i + " Bu sayi hem 3`un hem de 4`un katidir.");

            }else if (i % 3 == 0 ) { // sadece 3'e bolunebilme kosulunu kontrol eder.

                System.out.println(i + " Bu sayi  3`un katidir.");

            }else if (i % 4 == 0 ) { // sadece 4'e bolunebilme kosulunu kontrol eder.
                System.out.println(i + " Bu sayi  4`un katidir.");

            }


        }
    }
}