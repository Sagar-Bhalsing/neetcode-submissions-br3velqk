class Solution {
    fun findMin(nums: IntArray): Int {

        var l = 0
        var r = nums.size - 1
        while(l<r){
            val mid = l+(r-l)/2
            if(nums[mid]>nums[r]){
                l = mid + 1
            }
            if(nums[mid]<nums[r]){
                r = mid 
            }
        }
        return nums[l]
    }
}
