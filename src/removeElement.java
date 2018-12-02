/**
 *给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度
 *下面第一个解答是正解，第二个报错输入[1] 1时不通过，因为此时未做删除元素动作
 */

class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int len = nums.length;
        for(int x=0; x<len;x++){
            if(nums[x] != val){
                nums[i] = nums[x];
                i++;
            }
        }
        return i;
    }
}


class Solution2 {
    public int removeElement(int[] nums, int val) {
        int i=0;
        for(int x : nums){
            if(nums[x] != val){
                nums[i] = nums[x];
                i++;
            }
        }
        return i;
    }
}
            



