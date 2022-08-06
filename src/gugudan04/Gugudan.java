package gugudan04;

import java.util.*;

public class Gugudan {
	public static void main(String[] args) {
		//값 입력 및 조건문
		Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("--------------------");
			System.out.println("구구단 중 출력할 단은?");
			System.out.println("--------------------");
			System.out.print("선택: ");
			int number = Integer.parseInt(scanner.nextLine());
			System.out.println("[" + number + "단]");
			if(number<2 || number>9) {System.out.println("에러 발생: 범위에서 벗어났습니다."); return; }
			for (int i= 1; i < 10; i++) {
				int result = number*i;
				System.out.println(result);
				
			}
			System.out.println();
			
		}
		
		                   
	}		
}
