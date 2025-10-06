package in.nextit;

public class Array4 {

	public static void main(String[] args) {

		int[] array1 = new int[] { 12, 4, 7, 8, 9,1 };
		
		int min=array1[1];
		int max=array1[1];
		
		for (int i = 0; i < array1.length; i++) {
			
			if(min>array1[i])
			{
				min=array1[i];
			}
			if(max<array1[i])
			{
				max=array1[i];
			}
			
		}
		System.out.println("Minimum value in the array : "+min);
		System.out.println("Maximum value in the array : "+max);
        
		

	}

}
