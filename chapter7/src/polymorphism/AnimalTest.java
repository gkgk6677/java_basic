package polymorphism;

class Animal{
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("�������� ������ ���� ���ư��ϴ�.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		Animal hAnimal = new Human();
		Animal eAnimal = new Eagle();
		
		AnimalTest test = new AnimalTest();
		test.moveAnimal(hAnimal);
		test.moveAnimal(eAnimal);
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}


}