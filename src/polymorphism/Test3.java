package polymorphism;
class Person {
	int count=1;
	void f() {
		System.out.println("In one, count=:" + count++);
	}
	public  int getNext(int i) {
		return ++i;
	}
}

class Student extends Person {
	void f() {
		count = count * 3;
		System.out.println("In two, count="+count);
	}
	public int getNext(int i) {
		return i++;
	}
}

public class Test3{
	public static void main(String[] args) {
//		Person x = new Student();
//		Person y = (Person)x;
//		x.f();
//		y.f();
//		Student z = (Student) new Person();
//		z.f();
		int i = new Student().getNext(3);
		System.out.println(i);
		i = new Person().getNext(3);
		System.out.println(i);
		
	}
}