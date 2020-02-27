package algorithm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class money {

	public static void main(String[] args) {
		Scanner scan = new Scanner(new StringReader(input));


		
		int pm[] = new int[10]; // 개인 화폐매수
		int tm[] = new int[10]; // 전체 화폐매수
		int k;

		for (k = 1; k < 10; k++) {
			pm[k] = 0;
			tm[k] = 0;
		} // 전부 0으로 초기화해서 없는 금액에는 화폐매수를 0개로 인식

		String name;
		int money = 50000;
		int sw = 0;
		int inputMoney;

		System.out.println("                               출장비 지급 알람표");
		System.out.println("성명  출장비  오만원  만원  오천원  천원  오백원  백원  오십원  십원  오원  일원");
		System.out.println("------------------------------------------------------------------------------------");
		
		boolean check = false;
		 
		
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("이름을 입력하세요");
			name = scan.next();
			System.out.println(name);			
			}
			break;
	 // 이름입력종료
		
		while (true) {
			try {
				while (true) {
					Scanner scan = new Scanner(System.in);
					System.out.println("출장비를 입력하세요");
					inputMoney = scan.nextInt();
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("숫자만 입력하세요");				
			}
		}
		name = scan.next();
		
		while(true) {			
			if(name.equals("quit")) {
				break;
			}
			
		}
		
	
	}//main
}
