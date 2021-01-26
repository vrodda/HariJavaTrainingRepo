package array;

public class ArrayTest10 {

	public static void main(String[] args) {
		
		
		int a[] ={12,23,34,45,56};
		
		int b[] = new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			
			b[i] = a[i];
		}
		
		
		for (int temp : b) {
			System.out.println(temp);
		}
	}
}
