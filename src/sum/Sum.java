package sum;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 입력 : 키보드로 두 수의 입력을 받는다.
		
		int a, b;
		
		Scanner sc = new Scanner(System.in);
		
		String s1, s2;
		
		System.out.println("두 수를 입력해주세요");
		
		s1 = sc.next();
		s2 = sc.next();
		
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
		// 출력 : 화면에 두 수의합을 출력한다.
		System.out.printf("두 수의 합은 %d 입니다.", a + b);
		
		sc.close();
				 
	}

}
