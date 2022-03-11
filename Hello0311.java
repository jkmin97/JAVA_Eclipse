//package java_day02;
//// 클래스의 멤버는 static이 붙어있냐 붙어있지 않냐로 따질 수 있다.
//// static이 붙어있는 것 : 클래스 차원
//// static이 붙어있지 않는 것 : 객체 차원
//
//public class Hello0311 {
//	// 멤버 필드(Field) - 클래스의 멤버, 클래스의 전역변수 같은 것. 
//	static String name = "정경민"; //필드
//	static String job = "프로그래머";
//	// static은 정적이다.
//	// 속성, 변수, attribute, argument, parameter, param, argus 모두 비슷한 의미.
//	
//	// behavior, method, function, 기능, 함수는 비슷한 의미.
//	static int sum(int a, int b) {
//		return a + b;
//	}
//	// 클래스의 멤버는 크게 static 멤버와 non-static 멤버가 있다.
//	// static 멤버는 클래스 차원의 멤버
//	// non-static 멤버는 객체(instance) 차원의 멤버이다.
//	// 객체는 클래스를 이용해서 만들 수 있다.
//	// 그리고 클래스는 객체를 만들기 위해서 필요하다.
//	// 클래스 -> 객체 생성.(클래스가 있고 클래스를 이용해서 객체를 생성한다.)
//	// non-static 맴버는 객체 멤버이므로 객체를 만들지 않으면 사용 못 함.
//	
//	// non-static으로 메소드 선언
//	void printInfo() {
//		// non-static 멤버 메소드에서 static 멤버 호출 가능
//		System.out.println("성명" + name);
//		System.out.println("직업" + job);
//	}
//	
//	// 실행 단축키 Ctrl + F11
//	public static void main(String[] args) { //메소드()
//		// 지역 변수(local variable) - 함수 내부에 선언된 변수
//		// 정의 : static 멤버는 static 멤버만 호출 가능.
//		int i = sum(10, 20);
//		
//		// main 함수에서 멤버 필드 접근
//		System.out.println("Name : " + name);
//		System.out.println("Job : " + job);
//		System.out.println("Hello world!");
//	}
//}

package java_day02;

public class Hello0311 {
	static String name = "정경민";
	static String job = "프로그래머";
	static int sum(int a, int b) {
		return a + b;
	}
void printInfo() {
	System.out.println("성명" + name);
	System.out.println("직업" + job);
}
public static void main(String[] args) {
	int i = sum(10, 20);
	System.out.println(i);
	System.out.println("성명 : " + name);
	System.out.println("직업 : " + job);
	System.out.println("반가워요!");
	}
}