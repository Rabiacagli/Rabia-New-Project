public class Kosul {
    public static void main(String[] args) {
        int a = 5, b = 2, c = 5;
        boolean kosul1 = a==c;
        boolean kosul2 = a>=c;
        boolean result = kosul1 && kosul2;
        System.out.println(result);
        System.out.println(!result);
        boolean result2= ((a==b) && (b>=c));
        System.out.println(result2);
        String str = result2 ? "doğru" : "değil";
        System.out.println(str);



    }
}
