package listSample;

import java.util.Stack;

public class S {
public static void main(String[] args) {
	
	Stack s1 = new Stack();
	
	s1.push("Ameer");
	s1.push("Sharman");
	s1.push("Madhavan");
	s1.push("Chathur");
	
	System.out.println(s1);
	
	s1.pop();
	
	System.out.println(s1);
	
	System.out.println(s1.search("Ameer"));
	System.out.println(s1.search("Virus"));
	
	
	
	
}
}
