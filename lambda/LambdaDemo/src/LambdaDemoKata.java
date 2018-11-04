import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDemoKata {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60), 
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);

		// Sort list by last name
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		
		// print all the people in the list
		System.out.println("Printing all persons");
		printAllPeople(people);
	
		System.out.println("\nPrinting all persons with last name beginning with C");
		// print the people with the lastname starting with C
		printConditionally(people, new Condition() {

			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("C");
			}
			
		});
		
		System.out.println("\nPrinting all persons with first name beginning with C");
		printConditionally(people, new Condition() {

			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("C");
			}
			
		});
		
	}
	
	private static void printConditionally(List<Person> people, Condition condition) {
		// TODO Auto-generated method stub
		for (Person p: people) {
			if (condition.test(p)) {
				System.out.println(p);
			}
		}
	}

	private static void printAllPeople(List<Person> people) {
		// TODO Auto-generated method stub
		for (Person p: people) {
			System.out.println(p);
		}
	}
	
}

interface Condition {
	boolean test(Person p);
}

