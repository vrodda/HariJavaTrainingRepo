package collection;

public class TypeCastObjectArray {

	public static void main(String[] args) {
		
		Object objArray [] = new Object[4]; 
		
		Emp e1 = new Emp(101, "Smith");
		
		
		 objArray[0] =e1;
		 objArray[1] ="Hyd";
		 objArray[2] =new Integer(10);
		 objArray[3] =new Double(20);
		 
		 
		 for (int i = 0; i < objArray.length; i++) {
			
			 
			 
			Object temp = objArray[i];
			
		
			Emp employee = (Emp) temp;
			
			System.out.println(employee.empNo);
		}
		 
		 
	}
}
