import java.util.stream.Stream;

import java.time.LocalDate;

import models.Projector;

public class Main
{
	public static void main(String[] args)
	{
		Projector[] currArr = new Projector[]
		{
		    new Projector("Epson XG400", (short) 2022, 999.99, "Epson"),
		    new Projector("BenQ TK850i", (short) 2023, 1599.99, "BenQ"),
		    new Projector("Optoma UHD38", (short) 2021, 1299.99, "Optoma"),
		    new Projector("ViewSonic PX747-4K", (short) 2020, 849.99, "ViewSonic"),
		    new Projector("LG HU810PW", (short) 2022, 2499.99, "LG")
		};
		
		System.out.println("1-----1");
		Stream.of(currArr).forEach(Main::printlnProjector);
		
		System.out.println("2-----2");
		Stream.of(currArr).filter(val -> val.getManufacturer() == "ViewSonic").forEach(Main::printlnProjector);
		
		System.out.println("3-----3");
		Stream.of(currArr).filter(val -> val.getIssueYear() == LocalDate.now().getYear()).forEach(Main::printlnProjector);
		
		System.out.println("4-----4");
		Stream.of(currArr).filter(val -> val.getPrice() > 500.0).forEach(Main::printlnProjector);
		
		System.out.println("5-----5");
		Stream.of(currArr).sorted(Main::sortByPriceAsc).forEach(Main::printlnProjector);
		
		System.out.println("6-----6");
		Stream.of(currArr).sorted(Main::sortByPriceDsc).forEach(Main::printlnProjector);
		
		System.out.println("7-----7");
		Stream.of(currArr).sorted(Main::sortByIssueYearAsc).forEach(Main::printlnProjector);
		
		System.out.println("8-----8");
		Stream.of(currArr).sorted(Main::sortByIssueYearDsc).forEach(Main::printlnProjector);
	}
	
	private static void printlnProjector(Projector val)
	{ System.out.println(val); }

	private static int sortByPriceAsc(Projector firstVal, Projector secondVal)
	{
		if (firstVal.getPrice() > secondVal.getPrice())
			return 1;
		else if (firstVal.getPrice() < secondVal.getPrice())
			return -1;
		else
			return 0;
	}
	
	private static int sortByPriceDsc(Projector firstVal, Projector secondVal)
	{
		if (firstVal.getPrice() < secondVal.getPrice())
			return 1;
		else if (firstVal.getPrice() > secondVal.getPrice())
			return -1;
		else
			return 0;
	}
	
	private static int sortByIssueYearAsc(Projector firstVal, Projector secondVal)
	{
		if (firstVal.getIssueYear() > secondVal.getIssueYear())
			return 1;
		else if (firstVal.getIssueYear() < secondVal.getIssueYear())
			return -1;
		else
			return 0;
	}
	
	private static int sortByIssueYearDsc(Projector firstVal, Projector secondVal)
	{
		if (firstVal.getIssueYear() < secondVal.getIssueYear())
			return 1;
		else if (firstVal.getIssueYear() > secondVal.getIssueYear())
			return -1;
		else
			return 0;
	}
}
