package gugudan02;

import java.util.*;

public class Gugudan {
	public static void main(String[] args) {
		//값 입력 및 변수
		
		System.out.print("구구단 중 출력할 단은?");
		Scanner scanner = new Scanner(System.in);
		int number = Integer.parseInt(scanner.nextLine());
		
		System.out.println("[" + number + "단]");
		System.out.println(number * 1);
		System.out.println(number * 2);
		System.out.println(number * 3);
		System.out.println(number * 4);
		System.out.println(number * 5);
		System.out.println(number * 6);
		System.out.println(number * 7);
		System.out.println(number * 8);
		System.out.println(number * 9);
		
		                   
	}		
}
