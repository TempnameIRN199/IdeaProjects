package services;

import models.Person;

import java.util.Scanner;

import java.sql.Date;

public final class PersonSrvc
{
	public static void promptInput(Person value, Scanner scanner)
	{
	    System.out.print("Surname: ");
	    value.setSurname(scanner.nextLine());

	    System.out.print("Name: ");
	    value.setName(scanner.nextLine());

	    System.out.print("Patronymic: ");
	    value.setPatronymic(scanner.nextLine());

	    System.out.print("Birthdate: ");
	    value.setBirthdate(Date.valueOf(scanner.nextLine()));

	    System.out.print("Telephone: ");
	    value.setTelephone(scanner.nextLine());

	    System.out.print("City: ");
	    value.setCity(scanner.nextLine());

	    System.out.print("Country: ");
	    value.setCountry(scanner.nextLine());

	    System.out.print("Address: ");
	    value.setAddress(scanner.nextLine());
	}
}
