package javacourses.tecH.day35Lambdacourse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class _PrLambda {
	
	public static void main(String[] args) {

		List<Integer> ll = new ArrayList<>();
		ll.add(12);
        ll.add(9);
        ll.add(131);
        ll.add(14);
        ll.add(9);
        ll.add(10);
        ll.add(4);
        ll.add(12);
        ll.add(15);
		
		
		o1(ll);
		
	}
	
	public static void o1(List<Integer> l) {
		//functionalProgramming-1
		l.stream().forEach(t-> System.out.print(t+ "  "));
		System.out.println();
		l.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+"  "));
		System.out.println();
		l.stream().distinct().filter(t->t%2!=0).map(t->t*t).forEach(t->System.out.print(t+" "));
		System.out.println();
		Integer sum = l.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(0, (t,u)->t+u);
		System.out.println("sum: " + sum);
		Integer min1 = l.stream().reduce(Integer.MIN_VALUE, (t,u)-> t>u ? t : u);
		System.out.println(min1);
		Integer min2 = l.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t,u)->u);
		System.out.println(min2+"\n");
		Integer min3 = l.stream().distinct().filter(t->t>7 && t%2==0).sorted().findFirst().get();
		System.out.println(min3);
		List<Integer> result = l.stream().
										distinct().
										filter(t->t>5).
										map(t->t/2).
										sorted(Comparator.reverseOrder()).
										collect(Collectors.toList());
		System.out.println(result);
		
	
		//functionalProgramming-2
		System.out.println("Functional-2");
		l.stream().forEach(Utils::printInTheSameLineWithASpace);
		System.out.println();
		l.stream().filter(Utils::checkToBeEven).forEach(Utils::printInTheSameLineWithASpace);
		System.out.println();
		l.stream().filter(Utils::checkToBeOdd).map(Utils::getSquare).forEach(Utils::printInTheSameLineWithASpace);
		System.out.println();
		l.stream().distinct().filter(Utils::checkToBeEven).map(Utils::getCube).forEach(Utils::printInTheSameLineWithASpace);
		System.out.println();
		l.stream().distinct().filter(Utils::checkToBeOdd).map(Utils::getCube).forEach(Utils::printInTheSameLineWithASpace);
		System.out.println();
		Integer sumx = l.stream().distinct().filter(Utils::checkToBeEven).map(Utils::getSquare).reduce(0, Math::addExact);
		System.out.println(sumx);
		System.out.println();
		List<Double> res = l.stream().distinct().filter(t->t>5).map(Utils::getHalf).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(res);
		System.out.println();
		
		
		
		
		
	}
	
	
}