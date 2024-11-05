package tongsolevachan;

public class tongSoLevaChan {

    public static void main(String[] args) {
        int sumOdd = 0, sumEven = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        System.out.println("Tong so chan: " + sumEven);
        System.out.println("Tong so le: " + sumOdd);
    }
}
