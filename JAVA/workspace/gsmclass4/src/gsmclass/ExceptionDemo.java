package gsmclass;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		int n1 , n2;
		// �� �ΰ��� ������ �Է¹޾Ƽ� ���� ���ϴ� �˰���
		Scanner sc = new Scanner(System.in);
		
		try {
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			System.out.println("���� ���� ���� ::" + (n1 / n2));
		}catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println("0���δ� ������ �����ϴ�.");
		}

	}

}
