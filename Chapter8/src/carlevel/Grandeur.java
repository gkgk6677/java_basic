package carlevel;

public class Grandeur extends Car {

	@Override
	public void start() {
		System.out.println("Grandeur가 출발");
	}

	@Override
	public void drive() {
		System.out.println("Grandeur가 운전");
	}

	@Override
	public void stop() {
		System.out.println("Grandeur가 스탑");
	}

	@Override
	public void turnoff() {
		System.out.println("Grandeur의 시동 꺼짐");
	}
}
