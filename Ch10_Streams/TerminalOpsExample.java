import java.util.*;
import java.util.stream.*;

public class TerminalOpsExample {

	private static final List<String> listString = List.of("dan","Jenny", "cooper","brandy","cal","bigs");
	private static final List<Integer> listNum = List.of(4,-1,3,9,10,100,-12);

	public static final void main(final String[] args) {
		
		System.out.println("Count: "); 
		System.out.println(listString.stream().count()); // 6
		System.out.println(listNum.stream().count()); // 7
		System.out.println(Stream.empty().count()); // 0

		System.out.println("min and max:");
		System.out.println(listNum.stream().min(Comparator.naturalOrder()).get()); // -12
		System.out.println(listString.stream().min(Comparator.naturalOrder()).get()); // Jenny
		System.out.println(listString.stream().max(
			Comparator.comparingInt(String::length)
			.thenComparing(Comparator.reverseOrder())).get()); // brandy
	
		System.out.println("matching:");
		System.out.println(listString.stream().allMatch(s -> !s.isBlank())); // true
		System.out.println(listString.stream().anyMatch(s -> s.charAt(0) == 'J')); // true
		System.out.println(listNum.stream().noneMatch(i -> i > 99)); // false
		
		System.out.println("for each:");
		listString.stream().forEach(System.out::println);
		
		System.out.println("reduce:");
		System.out.println(listNum.stream().reduce(1, (a,b)-> a*b)); // product= 1296000;
		System.out.println(listNum.stream().reduce((a,b) -> a+b).get()); // sum = 113
		System.out.println(listString.stream().reduce("", String::concat)); // danJennycooperbrandycalbigs
		System.out.println(listString.stream().reduce(0, (i,s)->i+s.length(), Integer::sum)); // 27
		
		System.out.println("collect");
		System.out.println(listNum.stream().collect(TreeSet::new,TreeSet::add,TreeSet::addAll).toString());
		// [-12, -1, 3, 4, 9, 10, 100]
		System.out.println(listString.stream().collect(Collectors.toCollection(TreeSet::new)).toString()); 
		// [Jenny, bigs, brandy, cal, cooper, dan]
	}
}

