package gugudan06;

import java.util.*;

public class Gugudan {
	//메소드를 활용한 구구단
	
	public static int[] calculate(int time) {
				int[] value = new int[9];
				
				for(int i=0; i<value.length; i++) {
					value[i] = time*(i+1);
				}
				return value;
	}
	
	public static void show(int[] value) {
		
		for(int i=0; i<value.length; i++) {
			
			System.out.println(value[i]);
		}
	}
	
	public static void service() {
		Scanner scanner = new Scanner(System.in);
		try {
			
			while(true) {

				System.out.println("--------------------");
				System.out.println("구구단 중 출력할 단은?");
				System.out.println("--------------------");
				System.out.print("선택: ");
				
				String temp = scanner.nextLine();
				if(temp.equals("")) {System.out.println("값을 입력해주세요."); continue; }
				int time = Integer.parseInt(temp); 
				if(time<2 || time>9) {System.out.println("에러 발생: 범위에서 벗어났습니다."); continue; }

				System.out.println("[" + time + "단]");
				
				int[] value = calculate(time);
										
				show(value);
				scanner.close();
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void main(String[] args) {
		service();
		
	}		
}
