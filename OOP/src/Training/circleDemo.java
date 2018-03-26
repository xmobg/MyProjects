package Training;

public class circleDemo {

	public static void main(String[] args) {
		// Declare an instance of Circle class called c1.
	      // Construct the instance c1 by invoking the "default" constructor
	      // which sets its radius and color to their default value.
		circle c1 = new circle();
		// Invoke public methods on instance c1, via dot operator.
		System.out.println("The circle has radius of " + c1.getRadius()+" and area of " +c1.getArea());
		// Declare an instance of class circle called c2.
	      // Construct the instance c2 by invoking the second constructor
	      // with the given radius and default color.
		circle c2 = new circle(5.0,"blue");
		System.out.println("The circle has radius of "+c2.getRadius()+" and area of "+c2.getArea());
		System.out.println("The circle has a " +c2.getColor()+" color");
		circle c3 = new circle();
		c3.setRadius(5.0);
		c3.setColor("green");
		System.out.println("The circle has a radius of "+c3.getRadius()+" and area of "+c3.getArea());
		System.out.println("The circle has a "+c3.getColor()+" color");
		System.out.println(c3.toString());
		System.out.println(c3);
		System.out.println("Operatior'+'invokes toString() too" +c3);

	}

}
