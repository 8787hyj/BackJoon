package if문;

import java.util.Scanner;

public class Main_2884_5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		
		if (m>=45) {
			System.out.println(h+" "+(m-45));
		} else if (m<45) {
			if(h-1 <0) {
				h = 24;
			}
			System.out.println((h-1)+" "+(60+m-45));
		}
	}
}
