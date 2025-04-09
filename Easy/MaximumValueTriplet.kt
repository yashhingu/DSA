class Solution {
    fun maximumTripletValue(nums: IntArray): Long {
        var maxi = 0L
        var maxDiff = 0L
        var result = 0L

        for(num in nums){
            result = maxOf(result , maxDiff * num)
            maxDiff = maxOf(maxDiff, maxi - num)
            maxi = maxOf(maxi , num.toLong())
        }
        return result
    }
}