package gsmclass;
// ���׸� Ŭ����
class Div<T> { // <> Ÿ�� �Ű�����
	private T item;
	
	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
}
public class GenericDemo {

	public static void main(String[] args) {
		Div <Integer> d = new Div<>();
		d.setItem(10);
		System.out.println(d.getItem());
		Div <Double> d2 = new Div<>();
		d2.setItem(3.14);
		System.out.println(d2.getItem());
	}

}
