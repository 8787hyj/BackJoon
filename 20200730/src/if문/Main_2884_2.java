package if문;

import java.util.Scanner;

public class Main_2884_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int ansH = h;
		int ansM = m-45;
		sc.close();
		
		if (ansM < 0) {
			ansM += 60;
			ansH--;
			if(ansH < 0) {
				ansH += 24;
			}
		}
		System.out.println(ansH+" "+ansM);
		
	}
}
