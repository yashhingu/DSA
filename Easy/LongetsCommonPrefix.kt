class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var result = ""
        for (i in 0 until strs[0].length) {
            for (str in strs) {
                if (i == str.length || str[i] != strs[0][i]) {
                    return result
                }
            }
            result += strs[0][i]
        }

        return result
    }
}
