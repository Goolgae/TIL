package gsmclass;
class School extends Object {
	String name;
	School(String name) {
		this.name = name;
	}
	public String toString() {
		return "�츮 �б��� "+this.name;
	}
}
public class ObjectDemo {

	public static void main(String[] args) {
		School s = new School("GSM");
		System.out.println(s.toString());
		// �츮 �б��� GSM
	}

}
