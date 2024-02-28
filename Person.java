class Person{
	int age;
	float height;
	float weight;

	Person(){
		age= 25;
		height= 160.58f;
		weight= 60.25f;
	}
	Person(int a, float h, float w){
		age= a;
		height= h;
		weight= w;
	}
	Person(float h1, int a1, float w1){
		age= a1;
		height= h1;
		weight= w1;
	}

	public static void main(String args[]){
		Person per = new Person();
		Person per2 = new Person(30, 167.9f, 70.4f);
		Person per3 = new Person(56, 155.00f, 50.37f);
		per.display();
		per2.display();
		per3.display();
	}

	void display(){
		System.out.println("Age : " + age);
		System.out.println("Height : " + height);
		System.out.println("Weight : " + weight);
	}

}