class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var alphabets = IntArray(128){0}

        var left=0
        var right=0
        var max = 0
        while(right<s.length){
            var char = s[right]
            if(alphabets[char.code % 128]>0){
                left++
                right = left
                alphabets = IntArray(128){0}
                char = s[right]
            }
            alphabets[char.code % 128]++

            max = max(max, (right-left)+1)
            right++
        }

        return max
    }
}
