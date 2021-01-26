package objects;

public class Box {

	// class variable or instance variable or member variables or data fields
	double length;

	double breadth;

	double height;

	 Box()
	{
		
	}
	
	
	 Box(double a, double b, double c) {
		
		 length = a;

		breadth = b;

		height = c;
	}

	// member function or a method
	double volume() {
		return length * breadth * height;
	}

}
