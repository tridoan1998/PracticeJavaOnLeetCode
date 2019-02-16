
public class Solution {

	public static void main(String[] args) {
	int [] nums = new int [] {2, 7, 11, 15};
	int target = 9;

	int [] array = twoSum(nums, target);
	for(int i = 0; i< array.length;i++)
	{
		System.out.println(array[i]);
	}
	}

    public static int[] twoSum(int[] nums, int target)
	{
		int [] result = new int [2];
		
		int sum;
		for(int i = 0; i < nums.length;i++)
		{
			for(int j = i+1; j < nums.length;j++)
			{
				sum = 0;
				sum = nums[i]+nums[j];
				System.out.println(sum);
				if(sum == 9)
				{
					result[0] = i;
					result[1] = j;
				}
			}
		}
    	return result;
	}
    
    
    
}
