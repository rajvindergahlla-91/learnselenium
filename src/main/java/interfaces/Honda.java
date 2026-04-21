package interfaces;

public class Honda implements IVehicle {

	public void run() {
		System.out.println("honda runs");
	};

	public void brake() {
		System.out.println("honda stops");
	};

	public void indicate() {
		System.out.println("honda indicates");
	};

	public void move() {
		System.out.println("honda moves");
	};

	public void honk() {
		System.out.println("honda honks");
	}
}
