package 사칙연산;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/2588
 * 곱셈
 */
public class Main_2588 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		System.out.println( a * (b % 10));
		System.out.println( a * ((b % 100) / 10));
		System.out.println( a * (b / 10));
		System.out.println( a * b);
	}
}
