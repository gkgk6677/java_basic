package carlevel;

public class Sonata extends Car {

	@Override
	public void start() {
		System.out.println("Sonata가 출발");
	}

	@Override
	public void drive() {
		System.out.println("Sonata가 운전");
	}

	@Override
	public void stop() {
		System.out.println("Sonata가 스탑");
	}

	@Override
	public void turnoff() {
		System.out.println("Sonata의 시동 꺼짐");
	}
	
}
