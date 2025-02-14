import java.util.stream.Stream;

import model.Product;

public class Main
{
	public static void main(String[] args)
	{
		Product[] currArr = new Product[]
		{
		    new Product("Apple", "Fruit"),
		    new Product("Carrot", "Vegetable"),
		    new Product("Shampoo", "Personal Care"),
		    new Product("Notebook", "Stationery"),
		    new Product("Socks", "Clothing")
		};
		
		System.out.println("1-----1");
		Stream.of(currArr).forEach(val -> System.out.println(val));
		
		System.out.println("2-----2");
		Stream.of(currArr).filter(val -> val.getName().length() <= 5).forEach(val -> System.out.println(val));
		
		System.out.println("3-----3");
		System.out.println(Stream.of(currArr).filter(val -> val.getName( )== "Apple").count());
		
		System.out.println("4-----4");
		Stream.of(currArr).filter(val -> val.getName().charAt(0) == 'S').forEach(val -> System.out.println(val));
		
		System.out.println("5-----5");
		Stream.of(currArr).filter(val -> val.getCategory() == "Personal Care").forEach(val -> System.out.println(val));
	}
}
