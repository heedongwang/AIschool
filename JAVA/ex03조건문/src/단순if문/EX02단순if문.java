package 단순if문;

import java.util.Scanner;

public class EX02단순if문 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("숫자 입력:");
		int num= sc.nextInt();
		
		if(num%3==0 && num%5==0) {
			System.out.println("3과 5의 배수입니다.");
		}

		
		
		sc.close();
	}

}
