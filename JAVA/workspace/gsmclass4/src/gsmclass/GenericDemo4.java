package gsmclass;
// ���׸� �޼���

public class GenericDemo4 { // OuterŬ���� & �ܺ�Ŭ����
	static class Utils { // inner Ŭ���� & ���� Ŭ����
		public static <T> void showArray(T[] arr) {
			for (T t: arr) {
				System.out.println(t);
			}
		}
	}
	public static void main(String[] args) {
		Integer [] ia = {1,2,3,4,5};
		Utils.showArray(ia);
		Character [] ca = {'H','e','l','l','o'};
		Utils.showArray(ca);
	}

}
