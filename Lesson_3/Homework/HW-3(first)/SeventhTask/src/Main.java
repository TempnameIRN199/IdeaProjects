import services.IntArrSrvc;

public final class Main
{
	public static void main(String[] args)
	{
		IntArrSrvc currIntArrSrvc = new IntArrSrvc(new int[10]);
		currIntArrSrvc.initRandom(-40, 40);
		currIntArrSrvc.sortDsc();
		
		System.out.print(currIntArrSrvc.createStringPresentation
				(
						'\n' +
						"Min: " + currIntArrSrvc.min() + '\n' +
						"Max: " + currIntArrSrvc.max() + '\n' +
						"Avg: " + currIntArrSrvc.avg() + '\n'
				));
		
	}
}
