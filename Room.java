class Room{
	double height;
	double width;
	double breadth;
	
	Room(){
		height=20;
		width=30;
		breadth=15;
	}
	Room(double h, double w, double b){
		height=h;
		width=w;
		breadth=b;
	}

	void volume(){
		double volRoom = height*width*breadth;
		System.out.println("Volume of Room: " + volRoom);
	}
	double volume1(){
		double volRoom = height*width*breadth;
		return volRoom;
	}
	
	public static void main(String args[]){
		Room rm = new Room();
		Room rm1 = new Room(5.2, 12.0, 8.7);
		rm.volume();
		rm1.volume();
		System.out.println("Volume: " + rm1.volume1());
	}

}