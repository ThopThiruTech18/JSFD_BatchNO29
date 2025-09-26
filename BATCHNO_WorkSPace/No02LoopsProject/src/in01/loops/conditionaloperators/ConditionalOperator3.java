package in01.loops.conditionaloperators;

public class ConditionalOperator3 {
	public static void main(String[] args) {
		
		int marks=34;
		/*
		 * 90 to 100 ==> A Grade
		 * 75 to 89  ==> B Grade
		 * 50 to 74  ==> C-Grade
		 * 35 to 49  ==> D grade
		 */
		if(marks >=90)
		{
			System.out.println("A-Grade");
		}
		else if(marks >= 75)
		{
			System.out.println("B-Grade");
		}
		else if(marks >= 50)
		{
			System.out.println("C-Grade");
		}
		else if(marks >= 35)
		{
			System.out.println("D-Grade");
		}
		else if(marks >= 0){
			System.out.println("fail next time better");
		}
		else
		{
			System.out.println("Please enter a valid marks");
		}
		
		
		
	}

}
