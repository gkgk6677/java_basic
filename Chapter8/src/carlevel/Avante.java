package carlevel;

public class Avante extends Car {
	@Override
	public void start() {
		System.out.println("Avante가 출발");
	}

	@Override
	public void drive() {
		System.out.println("Avante가 운전");
	}

	@Override
	public void stop() {
		System.out.println("Avante가 스탑");
	}

	@Override
	public void turnoff() {
		System.out.println("Avante의 시동 꺼짐");
	}
}
