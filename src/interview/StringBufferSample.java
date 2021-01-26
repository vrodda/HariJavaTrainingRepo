package interview;

public class StringBufferSample {

	public static void main(String[] args) {
		
		String s1="Sachin";  
		s1.concat(" Tendulkar");  
		   System.out.println(s1);
		   
		   
		   StringBuffer s2= new StringBuffer("Sachin");  
		   s2.append(" Tendulkar");
			
			   System.out.println(s2);
		   
	}
}
