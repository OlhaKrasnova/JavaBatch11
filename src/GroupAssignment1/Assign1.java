package GroupAssignment1;

public class Assign1 {

	public static void main(String[] args) {
		// Create a 2D array of integer values. Print the sum of all numbers.
		
		int[][] a = {
		        {25,12,60}, 
		        {48,6,2}, 
		        {1,70,16}, 
		        {5,6,7}  
		    };
		    int sum=0;
		    for (int row=0; row<a.length;row++){
		      for (int col=0;col<a[col].length;col++){
		        sum=sum+a[row][col];

		      }
		      System.out.println(sum);
		        
		    }
	}

}
