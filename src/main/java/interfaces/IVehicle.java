package interfaces;

public interface IVehicle {
public static final String colorOfVehicle= " black ";
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
	
	public static void tearoff()
	{
		System.out.println("vehicles tearoffs");
	}
}
