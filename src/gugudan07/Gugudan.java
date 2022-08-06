package gugudan07;

import java.util.*;

public class Gugudan {
	private int[] value = new int[9];
	int i;
	
	public int[] calculate(int time) {
		for(int i=0; i<value.length; i++) {
			value[i] = time*(i+1);
		}
		
		return value;
	}
	
	public void printGugudan() {
		System.out.println("--------------------");
		System.out.println(value[0] + "단");
		System.out.println("--------------------");
		
		for(int i=0; i<value.length; i++) {
			System.out.println(value[i]);
		}
	}
	
	public void serviceGugudan() {
		Scanner scanner = new Scanner(System.in);
		int time ;
		try {
			while(true) {
				System.out.println("------------------");
				System.out.println("구구단 단수를 입력해주세요.");
				System.out.println("------------------");
				System.out.print("선택:");
				
				String str = scanner.nextLine();
				if(str.equals("")) {
					System.out.println("숫자를 입력하세요."); continue;
				} else {
					time = Integer.parseInt(str);
					if(time<2 || time>9) {
						System.out.println("입력할 수 있는 값의 범위를 벗어났습니다.(2~9)");
						continue;
					}
				}
				
				calculate(time);
				printGugudan();
				
			}
		} catch (Exception e) {
			System.out.println("에러 발생: " + e.getMessage());
		}
		scanner.close();
	}

}
