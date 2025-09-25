package no01.operators;

public class UneryOperator {
	
	public static void main(String[] args) {
		
		
		//1)Increment
				//1)pre-increment
		        //2)post-increment
		//2)Decrement
				//1)pre-decrement
				//2)post-decrement
	   //Note : Pre = first position[It will effect in the same line]
			  //Post = last position[It will effect in the next line]
		
		int a=10;
		System.out.println(a++); //10
		System.out.println(++a);//10+1+1=12
		System.out.println(a++);//12
		System.out.println(a++);//13
		System.out.println(++a);//13+1+1=15
		System.out.println(a++);//15
		
		System.out.println("----------------");
		
		int b=10;
		System.out.println(--b);//9
		System.out.println(--b);//8
		System.out.println(b--);//8
		System.out.println(--b);//6
		System.out.println(--b);//5
		System.out.println(b--);//5
		
		int c=10;
		
		System.out.println(c++);//10
		System.out.println(--c);//10
		System.out.println(c++);//10
		System.out.println(c--);//11
		System.out.println(c++);//10
		System.out.println(c--);//11
		System.out.println(++c);//11
		
		
		
		
		
		
		
	}

}
