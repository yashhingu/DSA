/**
 * You are given an integer array nums. You need to ensure that the elements in the array are distinct. To achieve this, you can perform the following operation any number of times:
 * Remove 3 elements from the beginning of the array. If the array has fewer than 3 elements, remove all remaining elements.
 * Note that an empty array is considered to have distinct elements. Return the minimum number of operations needed to make the elements in the array distinct.
 *
 * Example 1:
 * Input: nums = [1,2,3,4,2,3,3,5,7]
 * Output: 2
 * */
class Solution {
    fun minimumOperations(nums: IntArray): Int {
        val set = mutableSetOf<Int>()
        for(i in nums.size-1 downTo 0){
            if(set.contains(nums[i])){
                return ceil((i+1)/3.0).toInt()
            }
            set.add(nums[i])
        }
        return 0
    }
}