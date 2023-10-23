public class KosulOgren {
    public static void main(String[] args) {
        int a = 34, b = 33, c = 35;

        if ((a < b) && (c > b)) {
            System.out.println("A en küçüktür: ");
        }else if (b>=a){
            System.out.println("B en büyüktür: ");
        }else {
            System.out.println("C en büyüktür: ");
        }
    }
}