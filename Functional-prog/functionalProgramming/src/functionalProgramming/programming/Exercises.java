package functionalProgramming.programming;

import java.util.List;

public class Exercises {

	public static void main(String[] args) {
		
		List<Integer> numbers=List.of(12,36,234,43);
//		printEvenNumbersFunctional(numbers);
		List<String> courses=List.of("Spring","Springboot","AWS","GCP","Azure");
		
//		courses.stream().filter(course->course.contains("Spring")).forEach(System.out::print);
//		courses.stream().filter(course->course.length()>=4).forEach(System.out::print);
//		numbers.stream().filter(num->num%2==0).map(x->x*x).forEach(System.out::println);
		courses.stream().map(x->x.length()).forEach(System.out::println);
	}
	private static void printEvenNumbersFunctional(List<Integer> numbers) {
		numbers.stream().filter(num -> num%2==0).forEach(System.out::println);
	}
	private static void printOddNumbersFunctional(List<Integer> numbers) {
		numbers.stream().filter(num -> num%2==1).forEach(System.out::println);
	}
	
}
