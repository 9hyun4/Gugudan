package gugudan08;

import java.util.*;

public class Gugudan {
	
	public static int[][] calculate(int first, int second) {
		if(!(first<2 || second<2)) {
			int[][] arr = new int[first-1][second];
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					arr[i][j] = (i+2)*(j+1);
				}
			}
			return arr;
		} else {
			System.out.println("입력 가능한 값의 범위를 벗어났습니다.");
			return null;
		}
		
	}
	
	public static void printGugudan(int[][] arr) {
		if(arr == null) {return;}
		for(int i=0; i<arr.length; i++) {
			int[] inArr = arr[i];
			System.out.println("-------------------");
			System.out.println("[" + (i + 2)  + "단]");
			System.out.println("-------------------");
			for(int j=0; j<inArr.length; j++) {
				System.out.println(inArr[j]);	
			}
		}
		System.out.println();
	}
	
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			while(true) {
				System.out.print("fist value: ");
				String str1 = scanner.nextLine();
				System.out.print("second value: ");
				String str2 = scanner.nextLine();
				
				
				if(str1.equals("") || str2.equals("")) {System.out.println("값을 입력해주세요."); continue; }
				
				int first = Integer.parseInt(str1);
				int second = Integer.parseInt(str2);
				printGugudan(calculate(first, second));
			}
		} catch (Exception e) {
			System.out.println("입력 오류: " + e.getMessage());
		}
		
		scanner.close();
		
		
		
	}

}
