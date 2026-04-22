package interfaces;

public class Test {
public static void main(String[] args)
{
	IVehicle iv = new Honda();
	IVehicle.honk();
	iv.emergencyBrakes();
	Honda hn= new Honda();
	hn.honk();
	
	System.out.println("the color is : " + IVehicle.colorOfVehicle);
	iv.emergencyBrakes();
	IShip is = new Honda();
	is.emergencyBrakes();

	
}
}
