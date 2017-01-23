public class TwoSum {
    
    public int[] twoSum(int[] nums, int target) {
    	Map<Integer, Integer> numbers = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
        	numbers.put(nums[i], i);
        }
        for (int i = 0; i < nums.length - 1; i++) {
        	int secondNum = target - nums[i];
        	Integer secondIndex = numbers.get(secondNum);
        	if ((secondIndex != null) && (secondIndex != i)) {
        		return new int[] {i, secondIndex};
        	}
        }
		return null;
	}
    
    public int[] twoSumN2(int[] nums, int target) {
         for (int i = 0; i < nums.length - 1; i++) {
	         for (int j = i + 1; j < nums.length; j++) {   
	        	 if (nums[i] + nums[j] == target) {
	                return new int[]{i,j};
	            }
	         }
	     }
		return null;
	}
	
	public static void main(String[] args) {
    	TwoSum sum = new TwoSum();
    	int [] solution = sum.twoSum(new int[] {2, 7, 11, 15}, 18);
    	//[-3,4,3,90] 0
    	for (int i = 0; i < solution.length; i++) {
    		System.out.println(solution[i]);
    	}
    }
}
