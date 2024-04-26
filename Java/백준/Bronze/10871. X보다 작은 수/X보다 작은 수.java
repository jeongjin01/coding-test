import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //정수 n개
        int x = scanner.nextInt(); //정수 x
        int[] arr = new int[n]; //정수 n개 배열
        
        for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt(); //배열에 들어갈 수
		}
        
        for(int i = 0; i < n; i++) {
            if(arr[i] < x) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}