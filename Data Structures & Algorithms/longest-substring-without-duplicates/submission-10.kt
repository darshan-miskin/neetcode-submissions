class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val hashSet = HashSet<Char>()

        var left=0
        var right=0
        var max = 0
        while(right<s.length){
            var char = s[right]
            if(hashSet.contains(char)){
                left++
                right = left
                hashSet.clear()
                char = s[right]
            }
            hashSet.add(char)

            max = max(max, hashSet.size)
            right++
        }

        return max
    }
}
