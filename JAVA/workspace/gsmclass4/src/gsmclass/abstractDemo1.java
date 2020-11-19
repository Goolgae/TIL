package gsmclass;
// �߻�Ŭ���� & �߻�޼���
abstract class Computer{
    // �߻�Ŭ���� : �߻�޼��带 ������ Ŭ����
    // �߻�޼��� : �ٵ� �������� ���� �޼���
    void turnOn() {
        System.out.println("���� On");
    }
    void turnOff() {
        System.out.println("���� off");
    }
    abstract void display(); //�߻� �޼��� // �ڽ�Ŭ�������� ������ ����
    void show(){
        turnOn();
        display();
        turnOff();
    }
}
class Notebook extends Computer{
    void display() {
        System.out.println("Notebook display");
    }
}
class Desktop extends Computer{
    void display() {
        System.out.println("Desktop display");
    }
}
public class abstractDemo1 {

    public static void main(String[] args) {
//        Computer n = new Notebook();
//        n.show();
//        Computer d = new Desktop();
//        d.show();
        
        Computer [] c = {new Notebook(), new Desktop()};
        for (Computer i : c)
            i.show();
    }
}