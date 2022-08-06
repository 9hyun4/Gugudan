package gugudan03;

import java.util.*;

public class Gugudan {
	public static void main(String[] args) {
		
		//반복문
		
		System.out.print("구구단 중 출력할 단은?");
		Scanner scanner = new Scanner(System.in);
		int number = Integer.parseInt(scanner.nextLine());
		int i = 1;
		while(i<10) {
			int result = number*i;
			System.out.println(result);
			i++;
		}
		
		for (i= 1; i < 10; i++) {
			int result = number*i;
			System.out.println(result);
			
		}
		
		                   
	}		
}
