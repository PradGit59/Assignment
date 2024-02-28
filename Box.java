class Box{
	int height;
	int width;
	float breadth;

	Box(){
		height = 15;
		width =20;
		breadth =1.05f;
		/*getVolume = height*width*breadth;
		getArea = 2*height*width + 2*width*breadth + 2*breadth*height;*/
	}

	public static void main(String args[]){
		Box obj = new Box();
		Box obj1 = new Box();
		System.out.println(obj.getVolume);
		System.out.println(obj.getArea);
	}

}