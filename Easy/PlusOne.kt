class Solution {
    fun plusOne(digits: IntArray): IntArray {
        for (i in digits.size -1 downTo 0){
            if(digits[i] == 9){
                digits[i] = 0
            }else{
                digits[i]++
                return digits
            }
        }
        val result = IntArray(digits.size + 1)
        result[0] = 1
        return result
    }
}