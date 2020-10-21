package main;

import java.text.ParseException;
import java.util.ArrayList;

import cocktailsort.CocktailSortProcess;
import model.Person;
import util.DefineValues;
import util.ShowProcess;

public class Main {

	private static ArrayList<Person> personList = new ArrayList<>();
	private static ArrayList<Person> sortedpersonList = new ArrayList<>();
	
	public static void main(String[] args) throws ParseException {
		
		
		personList = DefineValues.defineValues(personList);
		
		
		System.out.println("---------------------------------");
		System.out.println("BEFORE COCKTAIL SORT byId");
		ShowProcess.showValues(personList);	
		

		System.out.println("AFTER COCKTAIL SORT byId");
		CocktailSortProcess.byId(personList);	
		System.out.println("---------------------------------\n");
		
		System.out.println("BEFORE COCKTAIL SORT byLastName");		
		ShowProcess.showValues(personList);				
		
		System.out.println("AFTER COCKTAIL SORT byLastName");
		CocktailSortProcess.byLastName(personList);	
		System.out.println("---------------------------------\n");
		
		System.out.println("BEFORE COCKTAIL SORT byName");
		ShowProcess.showValues(personList);

		System.out.println("AFTER COCKTAIL SORT byName");
		CocktailSortProcess.byName(personList);
		System.out.println("---------------------------------\n");
		
		System.out.println("BEFORE COCKTAIL SORT byAge");		
		ShowProcess.showValues(personList);

		System.out.println("AFTER COCKTAIL SORT byAge");
		CocktailSortProcess.byAge(personList);
		System.out.println("---------------------------------");
		
		System.out.println("BEFORE COCKTAIL SORT byRegisterDate");		
		ShowProcess.showValues(personList);

		System.out.println("AFTER COCKTAIL SORT byRegisterDate");
		CocktailSortProcess.byRegisterDate(personList);
		System.out.println("---------------------------------");
	}
}
