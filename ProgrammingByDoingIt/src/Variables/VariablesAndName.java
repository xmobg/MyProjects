package Variables;

public class VariablesAndName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int is a variable for storage an integral type 32 bits
 int cars,drivers,passengers,cars_not_driven,cars_driven;
 // double is 64 bits that value can be floating point like 1.2,2.6 and etc.
 double space_in_a_car,carpool_capacity,average_passengers_per_car;
 //In the upper code we make few storages and here we are gonna give them a value 
 cars=100;
 // space_in_a_car is double so we are giving a value with dot between 4 and 0,its very important to not forget the . 
 space_in_a_car = 4.0;
 drivers=30;
 passengers=90;
 //here we give a storage that get the value of other storage
 cars_not_driven=drivers;
 cars_driven = drivers;
 carpool_capacity=cars_driven*space_in_a_car;
 average_passengers_per_car= passengers / cars_driven;
 System.out.println("There are " + cars + " cars available.");
 System.out.println("There are only " + drivers + " drivers available.");
System.out.println("There will be " + carpool_capacity + " people today");
System.out.println("We can transport " + carpool_capacity + " people today");
System.out.println("We have " + passengers + " to carpool today");
System.out.println("We need to put about " + average_passengers_per_car + " in each car.");
	}

}
