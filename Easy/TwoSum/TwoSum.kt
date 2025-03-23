import java.util.HashMap

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = hashMapOf<Int, Int>()
        for(i in nums.indices){
            val temp = target-nums[i]
            if(map.containsKey(temp)){
                return intArrayOf(map[temp]!!,i)
            }
            map[nums[i]] = i
        }
        return intArrayOf()
    }
}