package Strings;

public class CountOfChar {
public static void main(String[] args) {
	
//	String s = "java";
//	int count =0;
//	char c = 'a';
//	
//	for(int i=0 ; i<s.length() ; i++) {
//		char ch = s.charAt(i);
//		if( ch == c ) {
//			count++;
//		}
//	}
//	System.out.println(count);
	
	String s = "java";
	
	for(int i=0 ; i<s.length() ; i++) {
		int count = 0;
		char ch = s.charAt(i);
		if(s.indexOf(ch) == i ) {
			for(int j=0 ; j<s.length() ; j++) {
				if( s.charAt(j) == s.charAt(i) ) {
					count++;
				}
			}
				
		System.out.println(s.charAt(i)+" = "+count);
		}
		}
}
}
