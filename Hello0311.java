//package java_day02;
//// Ŭ������ ����� static�� �پ��ֳ� �پ����� �ʳķ� ���� �� �ִ�.
//// static�� �پ��ִ� �� : Ŭ���� ����
//// static�� �پ����� �ʴ� �� : ��ü ����
//
//public class Hello0311 {
//	// ��� �ʵ�(Field) - Ŭ������ ���, Ŭ������ �������� ���� ��. 
//	static String name = "�����"; //�ʵ�
//	static String job = "���α׷���";
//	// static�� �����̴�.
//	// �Ӽ�, ����, attribute, argument, parameter, param, argus ��� ����� �ǹ�.
//	
//	// behavior, method, function, ���, �Լ��� ����� �ǹ�.
//	static int sum(int a, int b) {
//		return a + b;
//	}
//	// Ŭ������ ����� ũ�� static ����� non-static ����� �ִ�.
//	// static ����� Ŭ���� ������ ���
//	// non-static ����� ��ü(instance) ������ ����̴�.
//	// ��ü�� Ŭ������ �̿��ؼ� ���� �� �ִ�.
//	// �׸��� Ŭ������ ��ü�� ����� ���ؼ� �ʿ��ϴ�.
//	// Ŭ���� -> ��ü ����.(Ŭ������ �ְ� Ŭ������ �̿��ؼ� ��ü�� �����Ѵ�.)
//	// non-static �ɹ��� ��ü ����̹Ƿ� ��ü�� ������ ������ ��� �� ��.
//	
//	// non-static���� �޼ҵ� ����
//	void printInfo() {
//		// non-static ��� �޼ҵ忡�� static ��� ȣ�� ����
//		System.out.println("����" + name);
//		System.out.println("����" + job);
//	}
//	
//	// ���� ����Ű Ctrl + F11
//	public static void main(String[] args) { //�޼ҵ�()
//		// ���� ����(local variable) - �Լ� ���ο� ����� ����
//		// ���� : static ����� static ����� ȣ�� ����.
//		int i = sum(10, 20);
//		
//		// main �Լ����� ��� �ʵ� ����
//		System.out.println("Name : " + name);
//		System.out.println("Job : " + job);
//		System.out.println("Hello world!");
//	}
//}

package java_day02;

public class Hello0311 {
	static String name = "�����";
	static String job = "���α׷���";
	static int sum(int a, int b) {
		return a + b;
	}
void printInfo() {
	System.out.println("����" + name);
	System.out.println("����" + job);
}
public static void main(String[] args) {
	int i = sum(10, 20);
	System.out.println(i);
	System.out.println("���� : " + name);
	System.out.println("���� : " + job);
	System.out.println("�ݰ�����!");
	}
}