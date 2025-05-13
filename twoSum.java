package free;

public class twoSum 
{
	    public static int twoSum(int[] nums, int target)
	    {
	        for(int i=0;i<nums.length;i++)
	        {
	            for(int j=i+1;j<nums.length;j++)
	            {
	                if(target==nums[i]+nums[j])
	                {
	                    System.out.println(i+" "+j);
	                } 
	            }
	        }
	        return 0;
	    }
	    public static void main(String[] args)
	    {
	        int a[]={2,7,11,15};
	        twoSum(a,9);
	    }
}
