package GroupAssignment1;

public class LargestSmallestNumberInArray {

	public static void main(String[] args) {
		// Maximum and minimum number in the array?
		int[] array=new int [4];
		array[0]=916;
		array[1]=10;
		array[2]=125;
		array[3]=1686;
		
		int min = array[0];
		 int max = array[0];
		 
		 for(int i=0; i< array.length; i++) {
		 
		 if(array[i] > max) {
		 max = array[i];
		 }else if (array[i] < min) {
		 min = array[i];
		 
		 }
		 }
		 System.out.println("Minimum number is : " + min);
		 System.out.println("Maximum number is : " + max); 
		 }
		

	}


