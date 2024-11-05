package tongcacchuso;
import java.util.Scanner;
public class Tongcacchuso {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);   

        System.out.print("Nhap vao mot so nguyen: ");
        int n = scanner.nextInt();   
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        System.out.println("Tong cac chu so: " + sum);
    }
} 

