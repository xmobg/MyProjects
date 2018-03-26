package Training;
//Two private instance variables: radius (of the type double) and color (of the type String), with default value of 1.0 and "red", respectively.
//Two overloaded constructors - a default constructor with no argument, and a constructor which takes a double argument for radius.
//Two public methods: getRadius() and getArea(), which return the radius and area of this instance, respectively.

public class circle {
	private double radius;
	private String color;
       public    circle(){
		radius=1.0;
		color="red";
	}
	public	circle(double r , String c){
			radius=r;
			color =c;
			
		}
		
		public double getRadius() {
			return radius;
		}
		public double getArea() {
			return radius*radius*Math.PI;
		}
		
		public String getColor() {
			return color;
		}
		public void setRadius(double newRadius) {
			radius=newRadius;
		}
		public void setColor(String newColor) {
			color=newColor;
		}
		public String toString() {
			return "Circle [radius="+radius+" color= "+color+"]";
		}
		
}

	
