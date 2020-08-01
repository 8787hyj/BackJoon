package if문;

import java.util.Scanner;

public class Main_2884_3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		
		m-=45;
		if (m<0) {
			if(h!=0) {
				h-=1;
				m+=60;
			}else {
				h=23;
				m+=60;
			}
		}
		System.out.println(h+" "+m);
	}
}
