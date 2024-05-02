import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String st = sc.next();
		int n = sc.nextInt()-1; //charAt()은 0번째부터 시작이므로 -1
		
		System.out.println(st.charAt(n));
		
		sc.close();
	}
}