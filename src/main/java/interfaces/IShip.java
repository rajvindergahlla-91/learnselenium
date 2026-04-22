package interfaces;

public interface IShip {
	public default void emergencyBrakes()
	{
		System.out.println("ship emergency brakes");
	}

}
