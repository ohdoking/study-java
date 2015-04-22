package decoratorPattern;

import java.util.Scanner;

public class Casher {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Beverage b = null;
		int coffee, option;
		
		System.out.println("������ OpenPaaS ī�信 ���Ű��� ȯ���մϴ�!");
		System.out.println("=========================");
		
		System.out.println("Ŀ�Ǹ� ������ �ּ���.");
		System.out.println("1. ��ũ �ν�Ʈ \\2000");
		System.out.println("2. �Ƹ޸�ī�� \\1000");
		System.out.println("===============");
		
		coffee = s.nextInt();
		if (coffee == 1) {
			b = new DarkRoast();
		} else if (coffee == 2) {
			b = new Americano();
		} else {
			System.out.println("Ŀ�Ǹ� �߸� �����ϼ̽��ϴ�.");
			return;
		}
		
		input:do {
			System.out.println("�߰��� �ɼ��� ������ �ּ���.");
			System.out.println("1. �� �߰� \\500");
			System.out.println("2. ���� ũ�� �߰� \\400");
			System.out.println("0. ���� �׸�");
			
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
				System.out.println("�ֹ��� �߸��Ǿ����ϴ�. ó������ �ٽ� ���ֽʽÿ�.");
				return;	
			}
		} while(true);
		
		System.out.println("�ֹ��� �Ϸ�Ǿ����ϴ�.");
		System.out.println("�ֹ� ���� : " + b.getDescription());
		System.out.println("���� : " + b.cost());
	}
}
