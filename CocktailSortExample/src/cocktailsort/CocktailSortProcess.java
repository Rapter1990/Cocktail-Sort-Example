package cocktailsort;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

import model.Person;
import util.ShowProcess;

public class CocktailSortProcess {

	private static ArrayList<Person> sortedpersonList = new ArrayList<>();
	private static Person[] sortedPersonArray = null;

	public static void byId(ArrayList<Person> personList) {
		Comparator<Person> compTr = new Comparator<Person>() {
			@Override
			public int compare(Person p0, Person p1) {
				return Long.compare(p0.getId(), p1.getId());
			}
		};

		Person[] persons = convertListToArray(personList);
		sortedPersonArray = cocktailSort(persons, compTr);

		sortedpersonList = convertArrayToList(sortedPersonArray);
		ShowProcess.showValues(sortedpersonList);
	}

	public static void byLastName(ArrayList<Person> personList) {
		Comparator<Person> compTr = new Comparator<Person>() {
			@Override
			public int compare(Person p0, Person p1) {
				Collator collator = Collator.getInstance(new Locale("tr", "TR"));
				return collator.compare(p0.getLastname(), p1.getLastname());
			}
		};

		Person[] persons = convertListToArray(personList);
		sortedPersonArray = cocktailSort(persons, compTr);

		sortedpersonList = convertArrayToList(sortedPersonArray);
		ShowProcess.showValues(sortedpersonList);
	}

	public static void byName(ArrayList<Person> personList) {
		Comparator<Person> compTr = new Comparator<Person>() {
			@Override
			public int compare(Person p0, Person p1) {
				Collator collator = Collator.getInstance(new Locale("tr", "TR"));
				return collator.compare(p0.getName(), p1.getName());
			}
		};

		Person[] persons = convertListToArray(personList);
		sortedPersonArray = cocktailSort(persons, compTr);

		sortedpersonList = convertArrayToList(sortedPersonArray);
		ShowProcess.showValues(sortedpersonList);
	}

	public static void byAge(ArrayList<Person> personList) {
		Comparator<Person> compTr = new Comparator<Person>() {
			@Override
			public int compare(Person p0, Person p1) {
				return Integer.compare(p0.getAge(), p1.getAge());
			}
		};

		Person[] persons = convertListToArray(personList);
		sortedPersonArray = cocktailSort(persons, compTr);

		sortedpersonList = convertArrayToList(sortedPersonArray);
		ShowProcess.showValues(sortedpersonList);
	}

	public static void byRegisterDate(ArrayList<Person> personList) {
		Comparator<Person> compTr = new Comparator<Person>() {
			@Override
			public int compare(Person p0, Person p1) {
				if (p0.getRegisterDate().before(p1.getRegisterDate())) {
					return -1;
				} else if (p0.getRegisterDate().after(p1.getRegisterDate())) {
					return 1;
				} else {
					return 0;
				}
			}
		};

		Person[] persons = convertListToArray(personList);
		sortedPersonArray = cocktailSort(persons, compTr);

		sortedpersonList = convertArrayToList(sortedPersonArray);
		ShowProcess.showValues(sortedpersonList);
	}

	private static Person[] convertListToArray(ArrayList<Person> personList) {
		Person[] persons = personList.toArray(new Person[personList.size()]);
		return persons;
	}

	private static ArrayList<Person> convertArrayToList(Person[] persons) {
		ArrayList<Person> personList = new ArrayList<>(Arrays.asList(persons));
		return personList;
	}

	private static Person[] cocktailSort(Person[] a, Comparator comp) {
		
		boolean swapped = true; 
        int start = 0; 
        int end = a.length;
        
        while (swapped == true) { 
        	swapped = false; 
        	
        	// Forward Pass
        	for (int i = start; i < end - 1; ++i) { 
                if (greaterThan(comp,a[i],a[i + 1])) { 
                    Person temp = a[i]; 
                    a[i] = a[i + 1]; 
                    a[i + 1] = temp; 
                    swapped = true; 
                } 
            } 
        	
        	if (swapped == false) 
                break; 
        	
        	swapped = false;
        	
        	end = end - 1;
        	
        	// Backward Pass
        	for (int i = end - 1; i >= start; i--) { 
                if (greaterThan(comp,a[i],a[i + 1])) { 
                	Person temp = a[i]; 
                    a[i] = a[i + 1]; 
                    a[i + 1] = temp; 
                    swapped = true; 
                } 
            } 
        	
        	start = start + 1; 
        }
		
		return a;
	}

	// ASC
	private static boolean greaterThan(Comparator comp, Person x, Person y) {
		return comp.compare(x, y) > 0;
	}

	// DESC
	private static boolean lessThan(Comparator comp, Person x, Person y) {
		return comp.compare(x, y) < 0;
	}
}
