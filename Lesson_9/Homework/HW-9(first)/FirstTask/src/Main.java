import java.util.Arrays;

import java.lang.Thread;

import utils.SumArrLogic;
import utils.AvgArrLogic;
import utils.RandArrInitLogic;

public class Main
{
	public static void main(String[] args)
	{
		RandArrInitLogic currRandArrInitLogic = new RandArrInitLogic(new int[10], -20, 20 + 1);
		SumArrLogic currSumArrLogic = new SumArrLogic(currRandArrInitLogic.getArr());
		AvgArrLogic currAvgArrLogic = new AvgArrLogic(currRandArrInitLogic.getArr());
		
		try
		{
			Thread tmpRandArrInitThread = new Thread(currRandArrInitLogic, "randArrInitThread");
			Thread tmpSumArrThread = new Thread(currSumArrLogic, "sumArrThread");
			Thread tmpAvgArrThread = new Thread(currAvgArrLogic, "avgArrThread");
			
			tmpRandArrInitThread.start();
			tmpRandArrInitThread.join();
			
			tmpSumArrThread.start();
			tmpAvgArrThread.start();
			
			tmpSumArrThread.join();
			tmpSumArrThread.join();
		}
		catch (Exception exc)
		{
			System.out.println("ERR: " + exc.getMessage());
		}
		
		System.out.println("ARR: " + Arrays.toString(currRandArrInitLogic.getArr()));
		System.out.println("SUM ARR: " + currSumArrLogic.getRslt());
		System.out.println("AVG ARR: " + currAvgArrLogic.getRslt());
	}
}
