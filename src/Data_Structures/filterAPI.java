package Data_Structures;

import java.util.Arrays;
import java.util.List;

public class filterAPI {
public static void main(String[] args) {
	
	List<Integer> li = Arrays.asList(1,2,3,4,5,6);
	
//	li.stream().filter(x->x%2==0).forEach(System.out::println);
	
//	li.stream().filter(x->x%2!=0).forEach(System.out::println);


	List<String> l1 = Arrays.asList("abc","def","xyz","aaa",null);
//	l1.stream().filter(x->x.startsWith("a")).forEach(System.out::println);
	l1.stream().filter(x->x!=null).forEach(System.out::println);
}
}
