import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] arr = new int[31]; //총 학생 수는 30이지만 1부터 배열을 돌릴 것이므로 +1
        for (int i = 1; i <= 28; i++) { //제출한 학생
            arr[scanner.nextInt()]++; //출석 번호
        }
        for (int j = 1; j <= 30; j++) { //총 학생
            if (arr[j] == 0) { //값이 증가하지 않는 인덱스
                System.out.println(j);
            }
        }
    }
}