package gugudan05;

import java.util.*;

public class Gugudan {
	public static void main(String[] args) {
		
		//배열로 구구단
		Scanner scanner = new Scanner(System.in);
		
		try {
			
			while(true) {

				System.out.println("--------------------");
				System.out.println("구구단 중 출력할 단은?");
				System.out.println("--------------------");
				System.out.print("선택: ");
				
				String temp = scanner.nextLine();
				if(temp.equals("")) {System.out.println("값을 입력해주세요."); continue; }
				
				int number = Integer.parseInt(temp); 
				int[] result = new int[9];
				
				if(number<2 || number>9) {System.out.println("에러 발생: 범위에서 벗어났습니다."); continue; }
				
				System.out.println("[" + number + "단]");
			
				for (int i= 0; i < result.length; i++) {
					result[i] = number*(i+1);
				}
				
				for (int i = 0; i < result.length; i++) {
					System.out.println(result[i]);
				}
				System.out.println();
				
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		                   
	}		
}
