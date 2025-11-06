package in.versionit;

public interface Vehicle {
	
	void startVehicle();
	default void engine()
	{
		System.out.println("engine added..");
	}

	
	static void color()
	{
		System.out.println("color is added..");
	}
}
