import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPrice = sc.nextInt();
        int totalAmount = sc.nextInt();
        int result = 0;
        for (int i = 1; i <= totalAmount; i++) {
            int price = sc.nextInt();
            int amount = sc.nextInt();
            
            result += price * amount;
        }
        if (totalPrice == result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}