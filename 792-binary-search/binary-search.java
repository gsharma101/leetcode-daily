class Solution {
    public int search(int[] nums, int target) {
        int start  = 0;
        int end = nums.length - 1;

        while(start<=end){

            // 1 To find the middle element
            int mid = start + (end - start) /2;
            
            // 2 When target is less than the middle element
            if(target < nums[mid]){
                end = mid - 1;
            } else if(target > nums[mid]){ 
            // 3 When target is larger than the middle element
                start = mid + 1;
            }else{
                return mid; 
            // 4 Element founded 
            }
        }

        return -1;
    }
}