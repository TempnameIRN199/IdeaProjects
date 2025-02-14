import utils.Transaction;

import java.util.stream.Stream;

public class Main
{
	public static void main(String[] args)
	{
		Transaction[] transactions = new Transaction[]
		{
			new Transaction(1, 150.50, "Deposit"),
		    new Transaction(2, 75.25, "Withdrawal"),
		    new Transaction(3, 300.00, "Deposit"),
		    new Transaction(4, 120.00, "Withdrawal"),
			new Transaction(5, 500.00, "Deposit"),
		    new Transaction(6, 200.75, "Transfer"),
		    new Transaction(7, 50.00, "Deposit"),
		    new Transaction(8, 30.00, "Withdrawal"),
		    new Transaction(9, 400.00, "Transfer"),
		    new Transaction(10, 600.00, "Deposit")
		};
		
		System.out.println("SUM: " + Stream.of(transactions).filter((val) -> val.getType() == "Deposit").
				mapToDouble(Transaction::getAmount).sum());
	}
}
