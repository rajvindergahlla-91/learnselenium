package interfaces;

public interface IVehicle {

	public void run();

	public void brake();

	public void indicate();

	public void move();

	public default void emergencyBrakes() {
		System.out.println("vehicle has emergency brakes");
	}

	public static void honk() {
		System.out.println("vehicle honks");
	}
}
