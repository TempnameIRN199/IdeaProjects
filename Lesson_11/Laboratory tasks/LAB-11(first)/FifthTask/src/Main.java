import utils.*;

import java.util.*;
import java.util.stream.Collectors;

public class Main
{
	public static void main(String[] args)
	{
        Order[] orders = new Order[]
        {
        	new Order(1, new Item[]
            {
            	new Item("Item 1A", 19.99),
                new Item("Item 2B", 9.99),
                new Item("Item 3B", 15.49),
                new Item("Item 4C", 7.99),
                new Item("Item 5C", 12.99)
            }),
            new Order(2, new Item[]
            {
            	new Item("Item 1B", 25.99),
                new Item("Item 2A", 14.49),
                new Item("Item 3B", 5.99),
                new Item("Item 4C", 19.49),
                new Item("Item 5A", 8.99)
            }),
            new Order(3, new Item[]
      		{
      			new Item("Item 1A", 10.99),
      			new Item("Item 2A", 17.49),
      			new Item("Item 3D", 20.00),
      			new Item("Item 4C", 6.99),
      			new Item("Item 5C", 13.49)
            })
        };
        
        
        Map<String, Long> specMap = Arrays.stream(orders).
        		flatMap(order -> Arrays.stream(order.getItems())).
        		map(Item::getName).
        		collect(Collectors.groupingBy(name -> name, Collectors.counting()));
        
        specMap.forEach((key, val) -> System.out.println(key + " - " + val));
	}
}
