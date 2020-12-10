package gsm;

import java.io.IOException;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.*; // ��ư �̺�Ʈ�� �õ� �Ϸ��� ����


import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {

	public Main(String[][] farr, int today) {

		Calendar cal = Calendar.getInstance();

		int year1 = cal.get(Calendar.YEAR);
		int mon1 = cal.get(Calendar.MONTH);
		int day1 = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);

		int n = (hour > 19 ? 0 : (hour < 13 ? 1 : 2)); // �ð��뿡 ���� ó�� �������� ȭ���� ����

		// ������Ʈ ����
		JFrame jFrame = new JFrame("GSM");
		JButton btn1 = new JButton("��¥ : " + year1 + "�� " + (mon1 + 1) + "�� " + day1 + "��");
		JButton btn4 = new JButton("made by Goolgae");
		JButton btn5 = new JButton("<HTML><center><h1>" + (n == 0 ? "��ħ" : (n == 1 ? "����" : "����")) + "</h1>"
				+ farr[today - 1][n] + "</center></HTML>");

		// ������Ʈ�� ���� �����̳� ���ϱ�
		Container container = jFrame.getContentPane();

		// ������Ʈ�� �����̳ʿ� �߰�

		container.add(btn1, BorderLayout.NORTH);
		container.add(btn4, BorderLayout.SOUTH);
		container.add(btn5, BorderLayout.CENTER);

		// ������ ũ�� ����
		jFrame.setSize(400, 400);

		// ������ ���̱� ����
		jFrame.setVisible(true);

		// ���� ��ư ����
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) throws IOException {
		int mount = 0; // title�� �ܾ� ������ �� ������ �����ϴ� ����

		// �̹����� ���� ���ϴ� �˰���
		// �� ���ĸ� �ָ��� ����� �ϱ� �����̴�. ���� ��û�ؼ������� ���� �� �˰��� �ۿ��� ������ ���� �ʴ´�.

		Calendar cal = Calendar.getInstance();

		int niceday = cal.get(Calendar.DATE); // ������ ��¥�� ���������� ���ϱ� ���� ����
		// cal.set(cal.YEAR, year);
		// cal.set(cal.MONTH, month-1); //1���� 0���� �����ϹǷ� ������ -1
		cal.set(Calendar.DAY_OF_MONTH, 1); // DAY_OF_MONTH�� 1�� ���� (���� ù��)

		int week = cal.get(Calendar.DAY_OF_WEEK); // �� ���� ���� ��ȯ (��:1 ~ ��:7)

		// �б� �޽� ����Ʈ�� ���� ��ŷ �۾�
		Document doc = Jsoup.connect("http://gsm.gen.hs.kr/xboard/board.php?mode=list&tbnum=8").get();
		Elements titles = doc.select(".content"); // Ŭ���������� �Ծ������

		// print all titles in main page
		for (Element e : titles) {
			mount++;
		}

		int day = (mount % 3 == 0 ? mount / 3 : (mount % 3 == 1 ? (mount / 3) + 1 : (mount / 3) + 2)) + 8;
		// System.out.println(day); // ��¥ ����� �������� Ȯ��

		String[][] array; // ������ �迭 ����

		String[] arr2;

		arr2 = new String[mount + 24]; // ���������� ������ ���� �迭 // 24�� �ָ��� �޽ķ��� �����Ѱ��̴�!!

		// ���� ������
		int cnt1 = 0; // �ݺ������� �迭�� ��ȯ��Ű�� ����!!
		for (Element e : titles) {
			arr2[cnt1] = e.text();
			cnt1++;
		}

		array = new String[day][3]; // ��ħ ���� �������� �����ϱ� ���� day * 3 ������� ����

		// �ָ��� �Ÿ��� Ÿ��
		int[] joolist; // �ָ��� ������� ���Ѱ� �ִ� ������ �迭 �Ͽ����� + 1�� �ص� �Ǵϱ�
		int cnt2 = 0; // �ݺ������� �迭�� ��ȯ��Ű�� ����!!

		joolist = new int[4];
		for (int restweek = 0; restweek < day; restweek += (restweek == 0 ? 7 - week : 7)) {
			if (restweek != 0) { // 0�� �� ���� ù°���� ����Ű�� ������ ��������� �Ѵ�.
				joolist[cnt2] = restweek - 1;
				cnt2++;
			}
		}

		// ���� ���� �߿��� �迭�� ���ڸ� �ֱ�

		int cnt3 = 0; // �ݺ������� �������迭�� i���� ��Ʋ������ ������ ���� ����
		for (int i = 0; i < day; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 4; k++) {
					if ((joolist[k] + 1) == i) {
						array[i][j] = "����� �ָ��Դϴ�.";
						array[i + 1][j] = "�Ͽ��� �ָ��Դϴ�.";
						i += 2;
					} else {
						array[i][j] = arr2[cnt3];
					}
				}
				cnt3++;
			}
		}
		for (int i = 0; i < day; i++) {
			for (int j = 0; j < 3; j++) {
				if (array[i][j] == null) {
					array[i][j] = "�޽� �̽ǽ�";
				} // \\�� ������ ������ ����ǥ���� ���ϰ� ���õ� ������ �߻��Ѵٰ� �Ѵ�.
				array[i][j] = array[i][j].replaceAll("\\*", "<br>"); // �ڹ� gui���� ������ �Ϸ��� html �ڵ� �� �ʿ��ϴٰ� �Ѵ�! ? ����ü ��
				array[i][j] = array[i][j].replaceAll("\\(|\\)| |\\.|[0-9]", ""); // �޴��� ���ö����� ���Ⱑ ���� �� ���� �����Ͽ���.
			} // �� �ڵ�� ũ�Ѹ� �ÿ� * �� �ٴ� �� ���ְ� �;� �˻��ϴٰ� ���൵ �� �� ������ �ϴ� �ǹ̿��� *�� \n���� ��ȯ�����ִ� �ڵ��̴�.
		} // �� �ƹ����� õ���ΰ� ����.

		// �׽�Ʈ �ڵ�
//		Scanner scan = new Scanner(System.in);
//		System.out.println("��¥�� �Է����ּ���.");
//		int when = scan.nextInt() - 1;
//		System.out.println("�����ΰ��� �ƴ� ��ħ? ����? ��ħ : 1, ���� : 2, ���� : 3");
//		int when2 = scan.nextInt() - 1;
//		
//		System.out.println(array[when][when2]);

		new Main(array, niceday);
	}

}
