class Solution {
    public void sortColors(int[] nums) {
        if(nums==null || nums.length <=1) return;
        int colFirst = 0;
        while(colFirst < nums.length && nums[colFirst] == 0) colFirst++;
        int colLast = nums.length-1;
        while(colLast >= 0 && nums[colLast] == 2) colLast--;
        
        //
        int index = colFirst;
        while(index<=colLast){
            if(nums[index]==1) index++;
            else if(nums[index]==0){
                switchNum(nums, colFirst, index);
                colFirst++;
                index++;
            }else if(nums[index]==2){
                switchNum(nums, colLast, index);
                colLast--;
            }
        }        
    }
    
    public void switchNum(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}