package gsmclass;
class Span<K, V> {
	private K key;
	private V value;
	Span(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
}
public class GenericDemo2 {

	public static void main(String[] args) {
		Span<String, Integer> s = new Span<String, Integer>("������", 18);
		
		System.out.println("�̸� ::"+s.getKey()+" ���� ::"+s.getValue());
		
		Span<String, Double> s2 = new Span<>("������", 185.5);
		
		System.out.println("�̸� ::"+s2.getKey()+" ���� ::"+s2.getValue());
	}

}
