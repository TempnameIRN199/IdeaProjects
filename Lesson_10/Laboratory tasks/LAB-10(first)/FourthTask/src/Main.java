import java.util.stream.Stream;

import java.time.LocalDate;

import model.Monitor;

public class Main
{
	public static void main(String[] args)
	{
        Monitor[] currMonitors = new Monitor[]
        {
        	new Monitor("Dell UltraSharp", 27.0f, 450.99, (short) 2022, "Dell"),
            new Monitor("Samsung Odyssey G7", 32.0f, 649.99, (short) 2021, "Samsung"),
            new Monitor("LG UltraFine", 24.0f, 349.50, (short) 2020, "LG"),
            new Monitor("Acer Predator", 27.0f, 799.99, (short) 2023, "Acer"),
            new Monitor("ASUS ProArt", 34.0f, 1200.00, (short) 2023, "ASUS")
        };
        System.out.println("1----------1");
        Stream.of(currMonitors).forEach(monitor -> System.out.println(monitor));
        System.out.println("2----------2");
        Stream.of(currMonitors).filter(monitor -> monitor.getInches() == 27.0f).forEach(monitor -> System.out.println(monitor));
        System.out.println("3----------3");
        Stream.of(currMonitors).filter(monitor -> monitor.getManufacture() == "LG").forEach(monitor -> System.out.println(monitor));
        System.out.println("4----------4");
        Stream.of(currMonitors).filter(monitor -> monitor.getIssueYear() == LocalDate.now().getYear()).forEach(monitor -> System.out.println(monitor));
        System.out.println("5----------5");
        Stream.of(currMonitors).filter(monitor -> monitor.getPrice() > 450.00).forEach(monitor -> System.out.println(monitor));
        System.out.println("6----------6");
        Stream.of(currMonitors).sorted(Main::sortByPriceAsc).forEach(monitor -> System.out.println(monitor));
        System.out.println("7----------7");
        Stream.of(currMonitors).sorted(Main::sortByPriceDsc).forEach(monitor -> System.out.println(monitor));
        System.out.println("8----------8");
        Stream.of(currMonitors).sorted(Main::sortByInchesAsc).forEach(monitor -> System.out.println(monitor));
        System.out.println("9----------9");
        Stream.of(currMonitors).sorted(Main::sortByInchesDsc).forEach(monitor -> System.out.println(monitor));
    }
	
	private static int sortByPriceAsc(Monitor firstObj, Monitor secondObj)
	{
		if (firstObj.getPrice() > secondObj.getPrice())
			return 1;
		else if (firstObj.getPrice() < secondObj.getPrice())
			return -1;
		else
			return 0;
	}
	
	private static int sortByPriceDsc(Monitor firstObj, Monitor secondObj)
	{
		if (firstObj.getPrice() < secondObj.getPrice())
			return 1;
		else if (firstObj.getPrice() > secondObj.getPrice())
			return -1;
		else
			return 0;
	}
	
	private static int sortByInchesAsc(Monitor firstObj, Monitor secondObj)
	{
		if (firstObj.getInches() > secondObj.getInches())
			return 1;
		else if (firstObj.getInches() < secondObj.getInches())
			return -1;
		else
			return 0;
	}
	
	private static int sortByInchesDsc(Monitor firstObj, Monitor secondObj)
	{
		if (firstObj.getInches() < secondObj.getInches())
			return 1;
		else if (firstObj.getInches() > secondObj.getInches())
			return -1;
		else
			return 0;
	}
}
