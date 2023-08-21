

public class RunningSumArray {

	public static void main(String[] args) {
		
	int[] nums = {2,3,4,6};
	int[] resultArray = runningSum(nums);
	for(int result: resultArray) {
		System.out.println("..."+ result);
	}
	

	}
	
	
	    public static int[] runningSum(int[] nums) {
	       int result = 0;
	       int[] runningSumArray = new int[nums.length];
	      int i=0;
	       for(int number:nums) {
	         result+=number;
	         runningSumArray[i]=result;
	         i++;
	         }
	       return runningSumArray;
	    }
	

}
