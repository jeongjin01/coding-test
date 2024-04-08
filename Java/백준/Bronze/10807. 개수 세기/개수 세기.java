import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); //배열의 개수
        int[] arr = new int[a]; //길이 a의 배열 생성

        for (int i = 0; i < a; i++) {
            arr[i] = scanner.nextInt(); //배열에 들어갈 정수들
        }
        int c = scanner.nextInt(); //개수를 찾을 값

        int count = 0; //개수를 저장할 값

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == c ) {
                count++; //배열의 i번째 숫자가 c와 같다면 카운트 +1
            }
        }
        System.out.println(count);
    }
}
