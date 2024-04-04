import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = n / 4;
        
        for (int i = 1; i <= a; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}