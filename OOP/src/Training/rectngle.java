package Training;

public class rectngle {
	private float lenght;
	private float width;
	public rectngle(){
		lenght=1.0f;
		width=1.0f;
	}
	public rectngle(float lenght,float width) {
		this ();
		lenght=this.lenght;
		width=this.width;
	}
	public float getLenght() {
		return lenght;
	}
	public void setLenght(float lenght) {
		this.lenght=lenght;
	}
	public float getWidth() {
	return width;
	}
	public void setWidth(float	width) {
		this.width=width;
	}
	public double getArea(){
		return lenght*width;
	}
	public double getPerimeter() {
		return (2*lenght)+(2*width);
	}
	public String toString() {
		return "Triangle[lenght="+lenght+" width= "+width+"]" ; 
	}
}