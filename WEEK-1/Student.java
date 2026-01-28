class Student 
{
	int rollno;
	String name;
	String branch;
	int marks;

	void getdata(int rollno,String name,String branch,int marks)
	{
		this.rollno=rollno;
		this.name=name;
		this.branch=branch;
		this.marks=marks;
	}
	void display()
	{
		
		System.out.println("Roll no: "+rollno);
		System.out.println("Name: "+name);
		System.out.println("Branch: "+branch);
		System.out.println("Marks: "+marks);
	}

	public static void main(String args[]) 
	{
		Student s1=new Student();
		Student s2=new Student();
		s1.getdata(100,"HARRY","CSE",89);
		s2.getdata(101,"POTTER","CSE",94);
		s1.display();
		s2.display();

	 
	}
}