import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class LambdaDemoKataJava8 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60), 
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);

		// Sort list by last name
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		// print all the people in the list
		System.out.println("Printing all persons");
		printConditionally(people, p -> true);
	
		System.out.println("\nPrinting all persons with last name beginning with C");
		// print the people with the lastname starting with C
		printConditionally(people, p -> p.getLastName().startsWith("C")); 
		
		System.out.println("\nPrinting all persons with first name beginning with C");
		printConditionally(people, p -> {
			return p.getFirstName().startsWith("C");
		});
		
	}
	
	private static void printConditionally(List<Person> people, Predicate<Person> condition) {
		// TODO Auto-generated method stub
		for (Person p: people) {
			if (condition.test(p)) {
				System.out.println(p);
			}
		}
	}
	
}



