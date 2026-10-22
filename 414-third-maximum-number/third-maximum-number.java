class Solution {
    public int thirdMax(int[] nums) {
      
        Arrays.sort(nums);
        int low=0;
        int high=nums.length-1;
        while(low<high)
        {
            int temp=nums[low];
            nums[low]=nums[high];
            nums[high]=temp;

            low++;
            high--;
        }

        int Count = 1;
        int prevElem = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
          
            if (nums[i] != prevElem) {
                Count++;
                prevElem = nums[i];
            }
            
            
            if (Count == 3) {
                return nums[i];
            }
        }
        
       
        return nums[0];
  
    }
}