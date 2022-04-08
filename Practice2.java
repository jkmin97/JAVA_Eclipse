package org.comstudy21.day19.ex06;

class Circle {
	int x;
	int y;
	int z;
	public Circle(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	@Override
	public String toString() {
		return "Circle(" + x + "," + y + ")반지름" + z;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	
}

public class Practice2 {

	public static void main(String[] args) {
		Circle a = new Circle(2, 3, 5);
		Circle b = new Circle(2, 3, 30);
		System.out.println("원 a : " + a);
		System.out.println("원 b : " + b);
		if(a.equals(b))
			System.out.println("같은 원");
		else
			System.out.println("서로 다른 원");

	}

}
