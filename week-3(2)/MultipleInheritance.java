class student 
{
	int rollNumber;
	void getNumber(int n){
		rollNumber=n;
	}
	void printNumber(){
		System.out.println("Roll NUmber is "+rollNumber);
	}

}
class Test extends student
{
	float part1,part2;
	void getMarks(float a,float b){
		part1=a;
	    part2=b;
	}
	void putMarks(){
        System.out.println("marks obtained: ");
		System.out.println("part1 is "+part1);
		System.out.println("part2 is "+part2);
	}
}
interface sports
{
	float sportwt=6.0F;
	void putwt();
}
class results extends Test implements sports
{
	float total;
	public void putwt(){
		System.out.println("sports weight "+sportwt);
	}
	void display(){
		total=part1+part2+sportwt;
		System.out.println("Total Marks "+total);
}
}
public class MultipleInheritance
{
	public static void main(String[] args){
		results a=new results();
		a.getNumber(10);
		a.printNumber();
		a.getMarks(85.5F,90.0f);
		a.putMarks();
		a.putwt();
		a.display();
	}
}




