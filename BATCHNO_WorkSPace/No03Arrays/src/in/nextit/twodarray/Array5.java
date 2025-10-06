package in.nextit.twodarray;

public class Array5 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 1, 1, 2 };
					 //0  1  2  3  4  5  6  7
		
		for (int i = 0; i < arr1.length; i++) {
			
			boolean isduplicate=false;
			
			for (int j = 0; j < arr1.length; j++) {
				
				if(i != j &&  arr1[i]==arr1[j])
				{
					isduplicate=true;
					break;
				}
				
			}
			
			if(!isduplicate)
			{
				System.out.println(arr1[i]);
			}
			
		}

	}

}
