import java.util.stream.Stream;

import model.Vehicle;

public class Main
{
	public static void main(String[] args)
	{
		Vehicle[] currVehicles = new Vehicle[]
		{
			new Vehicle("Toyota Camry", 15.8f, "Silver", 25000.0f, (short) 2020),
		    new Vehicle("Ford Mustang", 16.0f, "Red", 36000.0f, (short) 2019),
		    new Vehicle("Honda Civic", 12.4f, "Blue", 22000.0f, (short) 2021),
		    new Vehicle("Chevrolet Impala", 18.5f, "Black", 27000.0f, (short) 2018),
		    new Vehicle("Tesla Model S", 100.0f, "White", 75000.0f, (short) 2022)
		};
		
		Stream.of(currVehicles).forEach(vehicle -> System.out.println(vehicle));
		System.out.println("----------");
		
		Stream.of(currVehicles).filter(vehicle -> vehicle.getColor() == "Red").forEach(vehicle -> System.out.println(vehicle));
		System.out.println("----------");
		
		Stream.of(currVehicles).filter(vehicle -> vehicle.getFuelTank() == 12.4F).forEach(vehicle -> System.out.println(vehicle));
		System.out.println("----------");
		
		Stream.of(currVehicles).filter(vehicle -> vehicle.getPrice() > 30000.0F).forEach(vehicle -> System.out.println(vehicle));
		System.out.println("----------");
		
		Stream.of(currVehicles).
			filter(vehicle -> vehicle.getIssueYear() > 2000 && vehicle.getIssueYear() < 2020).
			forEach(vehicle -> System.out.println(vehicle));
	}
}
