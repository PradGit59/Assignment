class Student{
	String studentName;
	int marksScience;
	int marksMaths;
	int marksPhysics;

	void assign(int a, int b, int c){
		marksScience= a;
		marksMaths= b;
		marksPhysics= c;
	}

	void totalAvg(){
		float avg = (marksScience+ marksMaths+ marksPhysics)/3;
		System.out.println("Average score of "+ avg);
	}

	void display(){
		System.out.println("Student's name is : " + studentName);
		System.out.println("Total marks = " + (marksScience+ marksMaths+ marksPhysics));
	}
	

	public static void main(String args[]){
		Student objSt = new Student();
		objSt.studentName= "Pradnya";
		objSt.assign(91,72,86);
		objSt.totalAvg();
		objSt.display();
		
	}
}