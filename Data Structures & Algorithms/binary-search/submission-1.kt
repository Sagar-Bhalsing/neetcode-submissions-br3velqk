class Solution {
    fun search(nums: IntArray, target: Int): Int {

        var L = 0
        var H = nums.size-1
        var mid = 0

        while(L<=H){
            mid = L + (H-L)/2
            if(nums[mid]>target){
                H = mid-1
            }
            else if(nums[mid]<target){
                L = mid+1
            }
            else if(nums[mid] == target) return mid
        }
        return -1
    }
}
