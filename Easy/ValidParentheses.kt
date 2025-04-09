class Solution {
    fun isValid(s: String): Boolean {

        if(s.length % 2 != 0){
            return false
        }

        val stack = Stack<Char>()
        for (char in s){
            if(char == '{' || char == '(' || char == '['){
                stack.push(char)
            }else{
                if(stack.isEmpty()) return false
                val top = stack.peek()
                if((char == ')' && top != '(') || (char == ']' && top != '[') || (char == '}' && top != '{')) return false
                stack.pop()
            }
        }
        return stack.isEmpty()
    }
}