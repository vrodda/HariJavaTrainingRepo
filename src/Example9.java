
public class Example9 {

	public static void main(String[] args) {
		
	int	x = 1;
	int y=0;
	
	    y = 1 + x++;
	    System.out.println("x : "+x +"  y :"+y); // 2      2
	    
		y = 1 + ++x;
		 System.out.println("x : "+x +"  y :"+y);// 3      4
		 
		y = 1 + x--;
		 System.out.println("x : "+x +"  y :"+y);// 2      4
		 
		y = 1 + --x;
		 System.out.println("x : "+x +"  y :"+y);// 1      2

	}
}
