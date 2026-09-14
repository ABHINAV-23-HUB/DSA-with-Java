class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int firstposition=-1;
        int lastposition=-1;

        //for first position
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                firstposition=mid;
                end=mid-1;
            }
            else if (nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        //here reset start and end
        start=0;
        end=nums.length-1;
        // for last position
         while(start<=end){
             int mid=(start+end)/2;
            if(target==nums[mid]){
                lastposition=mid;
                start=mid+1;
            }
            else if (nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
          
    return new int[] {firstposition,lastposition};
}
    }