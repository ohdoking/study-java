package decoratorPattern;

import java.util.Scanner;

public class Casher {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Beverage b = null;
		int coffee, option;
		
		System.out.println("조촐한 OpenPaaS 카페에 오신것을 환영합니다!");
		System.out.println("=========================");
		
		System.out.println("커피를 선택해 주세요.");
		System.out.println("1. 다크 로스트 \\2000");
		System.out.println("2. 아메리카노 \\1000");
		System.out.println("===============");
		
		coffee = s.nextInt();
		if (coffee == 1) {
			b = new DarkRoast();
		} else if (coffee == 2) {
			b = new Americano();
		} else {
			System.out.println("커피를 잘못 선택하셨습니다.");
			return;
		}
		
		input:do {
			System.out.println("추가할 옵션을 선택해 주세요.");
			System.out.println("1. 샷 추가 \\500");
			System.out.println("2. 휘핑 크림 추가 \\400");
			System.out.println("0. 이제 그만");
			
			option = s.nextInt();
			
			switch(option) {
			case 1:
				b = new Shot(b);
				break;
				
			case 2:
				b = new Whipping(b);
				break;
				
			case 0:
				break input;
				
			default:
				System.out.println("주문이 잘못되었습니다. 처음부터 다시 해주십시오.");
				return;	
			}
		} while(true);
		
		System.out.println("주문이 완료되었습니다.");
		System.out.println("주문 내용 : " + b.getDescription());
		System.out.println("가격 : " + b.cost());
	}
}
