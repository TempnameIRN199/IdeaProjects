import models.Person;
import services.PersonSrvc;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner currScanner = new Scanner(System.in);
		Person currPerson = new Person();
		
		PersonSrvc.promptInput(currPerson, currScanner);
		
		System.out.println(currPerson);
		
		System.out.print("InstancesNum: " + Person.getInstancesNum());
	}
}