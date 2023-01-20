package zoho.test;

import java.util.Arrays;

public class SubArrays {

	public static void main(String[] args)
	    {
		 int[] arr = {1, 2, 3, 1, 5};
	      splitArray(arr);
	    }

	    public static void splitArray(int[] arr) 
	        {
	        int sum = 0;
	        for (int i = 0; i < arr.length; i++)
	        {
	            sum =sum+ arr[i];
	        }

	        if (sum % 2 != 0)
	        {
	            System.out.println("Cannot split array into sub array.");
	            return;
	        }
            int targetSum = sum / 2;
            int currentSum = 0;
	        int subArrayStartIndex = 0;
	        int subArrayEndIndex = 0;
	        
	        for (int i = 0; i < arr.length; i++) 
	          {
	            currentSum =currentSum + arr[i];
	            if (currentSum == targetSum)
	            {
	                subArrayEndIndex = i;
	                System.out.println(" Two arrays: " + Arrays.toString(Arrays.copyOfRange(arr, subArrayStartIndex, subArrayEndIndex + 1)));
	                subArrayStartIndex = i + 1;
	                currentSum = 0;
	            }
	        }
	    } 



}



	


