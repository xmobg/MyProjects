package Training;

public class VehicleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Vehicle v1=new Vehicle("Civic","black","2012","Honda","200"
//				+ "");
//		v1.setName("Eclipse");
//		System.out.println(v1.getName());
//		v1.setColor("blue");
//		v1.setCompany("Mitsubishi");
//		v1.setModel("2013");
//		System.out.println(v1.getColor());
//		System.out.println(v1.getCompany());
//		System.out.println(v1.getModel());
//		v1.setEngine("800");
//		System.out.println(v1.getSpeed());
//		System.out.print(v1.count);
//		System.out.println(Vehicle.getVehicle());
	
	Car ca1=new Car("civic","green","2012","Honda","800",true,false);
	System.out.println(ca1.getLedScreen());
	System.out.println(ca1.getName());
	Vehicle vehicle1=new Vehicle("Civic","green","1998","Honda","800"); 
	System.out.println(vehicle1.getInfo());
	Vehicle vehicle2=new Car("Civic","green","1998","Honda","800",true,false);
	System.out.println(vehicle2.getInfo());
	Vehicle vehicle3=new Bike("Civic","green","1998","Honda","800",true);
	System.out.println(vehicle3.getInfo());
}
	
}