package pack1;

public class One {

	
private int a =10;

protected int b =20;

public int c=30;

int d =40;


private void m1()
{
	System.out.println("I am Private method. I m avaible with in the same class(One)");
}

protected void m2()
{
	System.out.println("I am Protected method. I ll be availble with in same package(pack1). Also in other package, when the other package class will inherit me");
}

public void m3()
{
	System.out.println("I am Public method. I m avaible with in Any Class and Any Package");
}

void m4()
{
	System.out.println("I am Default method. I m avaible with in the same package");
	
}

public static void main(String[] args) {
	
	One obj = new One();
	
	System.out.println(obj.a);
	
	obj.m1();
}

}
