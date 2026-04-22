package interfaces;

public interface IAirplane {
	public default void emergencyBrakes()
	{
		System.out.println("airplane emergency brakes");
	}

}
