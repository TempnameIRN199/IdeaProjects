import services.ArraySrvc;

public final class Main
{
	public static void main(String[] args)
	{
		ArraySrvc<int[]> arraySrvc = new ArraySrvc<int[]>(new int[10]);
		
		ArraySrvc.ArraySrvcHelper.initRandomIntArr(arraySrvc.getTgtArr(), -40, 40);
		
		System.out.print(arraySrvc.createStringPresentation("ADDTLINFO"));
	}
}
