class Solution {
    fun isPalindrome(s: String): Boolean {
        if(s.length <= 1) return true
        var left = 0
        var right = s.lastIndex

        fun isInvalidChar(char: Int) = char>122 || char<48 || (char>57 && char<65) || (char>90 && char<97)

        while(left<=right){
            while(isInvalidChar(s[left].toInt()) && left<s.lastIndex) {left++}
            while(isInvalidChar(s[right].toInt()) && right>0) {right--}
            if(left>=right) break

            // println("left: ${s[left]} \t right: ${s[right]} \t right.toInt(): ${s[right].toInt()}")

            if(s[left].lowercase() != s[right].lowercase()) return false

            left++
            right--
        }
        return true
    }
}
