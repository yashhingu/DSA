class Solution {
    fun romanToInt(s: String): Int {
        var answer = 0
        var number = 0
        var previous = 0

        for(i in s.length-1 downTo 0){
            when(s[i]){
                'M'-> number = 1000
                'D'-> number = 500
                'C'-> number = 100
                'L'-> number = 50
                'X'-> number = 10
                'V'-> number = 5
                'I'-> number = 1
            }
            if(number<previous){
                answer-=number
            }else{
                answer+=number
            }
            previous = number
        }
        return answer
    }
}