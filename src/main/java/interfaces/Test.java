package interfaces;

public class Test {
public static void main(String[] args)
{
	IVehicle iv = new Honda();
	IVehicle.honk();
	iv.emergencyBrakes();
	Honda hn= new Honda();
	hn.honk();
}
}
