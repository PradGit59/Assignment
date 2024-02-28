class Vehicle{
	int price;
	String color;
	String model;
	
	Vehicle(){
		price= 55000;
		color= "Metalic Black";
		model= "V12-THSP-201";
	}

	public static void main(String args[]){
		Vehicle veh= new Vehicle();
		Vehicle veh1 = new Vehicle();
		
		veh.display();
		veh1.color = "Magenta";
		veh1.price = 690000;
		veh1.model = "SUV310";
		veh1.display();
		
	}

	void display(){
		System.out.println("Price of the Car : " + price);
		System.out.println("Color of the Car : " + color);
		System.out.println("Model of the Car : " + model);

	}

}