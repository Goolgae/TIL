package gsmclass;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		int n = 10;
		
		try {
			int n2 = Integer.parseInt(args[0]);
			System.out.println(n / n2);
		} catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println("0���� ������ �����ϴ�.");
		} catch (NumberFormatException e) {
			System.out.println(e);
			System.out.println("����� �� ������ �Է��ϼ���.");
		}
	}

}
