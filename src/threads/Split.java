package threads;

public class Split {

	public static void main(String[] args) {
		
		String sentence = "Tomorrow is holiday"; 
		
		
		String[] words = sentence.split(" ");  
		
		  
		for (String word : words)  
		{  
		   System.out.println(word);  
		}  
	}
}
