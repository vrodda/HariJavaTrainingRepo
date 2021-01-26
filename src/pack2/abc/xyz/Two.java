package pack2.abc.xyz;


import pack1.One;

public class Two extends One {

	public static void main(String[] args) {
		
		
		Two obj = new Two();
		
		System.out.println(obj.b);
		System.out.println(obj.c);
		//System.out.println(obj.d); As d is default- It is visible with in current package.
		
		
		obj.m2();
		obj.m3();
		//obj.m4(); As m4() is default- It is visible with in current package.
		
		
	}
}
