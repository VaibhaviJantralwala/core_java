package Data_Structures;

import java.util.Arrays;
import java.util.List;

public class StreamAPIprogram {
public static void main(String[] args) {
	
	List<Integer> li = Arrays.asList(2,3,4,5);
	
//	li.stream().map(x->x*x).forEach(System.out::println);
	li.stream().filter(x->x>4).map(x->x*x).forEach(System.out::println);
	
	List<String> list = Arrays.asList("abc","xyz");
//	list.stream().map(x->x.toUpperCase()).forEach(System.out::println);
	
//	li.stream().map(x->x+10).forEach(System.out::println);
	
	List<String> lis =  li.stream().map(x->String.valueOf(x)).toList();
	System.out.println(lis);
	
	
}
}
