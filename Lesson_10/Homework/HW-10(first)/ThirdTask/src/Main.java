import java.util.stream.Stream;

import model.Device;

public class Main
{
	public static void main(String[] args)
	{
        Device[] currArr =
        {
        	new Device("iPhone 15", "Smartphone", "Blue", (short) 2023, 999.99),
            new Device("MacBook Pro", "Laptop", "Silver", (short) 2022, 2499.99),
            new Device("Samsung Galaxy S24", "Smartphone", "Black", (short) 2024, 849.99),
            new Device("Sony WH-1000XM5", "Headphones", "Black", (short) 2023, 349.99),
            new Device("Dell XPS 13", "Laptop", "White", (short) 2023, 1399.99)
        };
        
        System.out.println("1-----1");
        Stream.of(currArr).forEach(Main::printDevice);
        
        System.out.println("2-----2");
        Stream.of(currArr).filter(val -> val.getColor() == "Black").forEach(Main::printDevice);
        
        System.out.println("3-----3");
        Stream.of(currArr).filter(val -> val.getIssueYear() == 2023).forEach(Main::printDevice);
        
        System.out.println("4-----4");
        Stream.of(currArr).filter(val -> val.getPrice() > 500.0).forEach(Main::printDevice);
        
        System.out.println("5-----5");
        Stream.of(currArr).filter(val -> val.getType() == "Smartphone").forEach(Main::printDevice);
        
        System.out.println("6-----6");
        Stream.of(currArr).filter(val -> val.getIssueYear() > 2023 && val.getIssueYear() < 2025).forEach(Main::printDevice);;
	}
	
	private static void printDevice(Device val)
	{ System.out.println(val); }
}
