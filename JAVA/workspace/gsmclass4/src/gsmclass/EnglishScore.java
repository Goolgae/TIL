package gsmclass;

class MathScore implements Comparable<MathScore> {
	String name;
	int score;
	MathScore(String name, int score) {
		this.name = name;
		this.score = score;
	}
	@Override
	public int compareTo(MathScore o) {
		return score > o.score ? 1 : (score<o.score ? -1 : 0);
	}
	public String toString() {
		return name + ", " + score;
	}
}
public class EnglishScore implements Comparable<EnglishScore> {
	String name;
	int score;
	public EnglishScore(String name, int score) {
		this.name = name;
		this.score = score;
	}
	public String toString() {
		return name + ", " + score;
	}
	@Override
	public int compareTo(EnglishScore o) {
		return score > o.score ? 1 : (score<o.score ? -1 : 0);
	}
	static <T extends Comparable> T findBest(T[] a) {
		T best = a[0];
		
		for (int i = 1; i < a.length; i++) {
			if(best.compareTo(a[i])==-1)
				best=a[i];
		}
		return best;
	}
	static <T> T findScore(T[] a, String name) {
		for (int i = 0; i < a.length; i++) {
			if(a[i].toString().substring(0,3).equals(name))
				return a[i];
		}
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "null";
			EnglishScore[] ea = {new EnglishScore("���",77), new EnglishScore("�念��",88),new EnglishScore("ȫ�浿",99)};
			MathScore[] ma = {new MathScore("���",77), new MathScore("�念��",88),new MathScore("ȫ�浿",99)};
			System.out.println("���� �ְ� ������: "+findBest(ea));
			System.out.println("���� �ְ� ������: "+findBest(ma));
			try {
				name = args[0];
				System.out.println("���� ����: "+ findScore(ea, name));
				System.out.println("���� ����: "+ findScore(ma, name));
			} catch (Exception e) {
				System.out.println("**��� ���� ����**");
				System.out.println(e);
			}
			
	}

}
