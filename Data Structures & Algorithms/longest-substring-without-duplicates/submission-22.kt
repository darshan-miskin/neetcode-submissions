class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val alphabet = IntArray(128) { -1 }
        var l = 0
        var res = 0

        for ((r, c) in s.withIndex()) {
            if (alphabet[c.code] != -1) {
                l = maxOf(l, alphabet[c.code] + 1)
            }
            res = maxOf(res, r - l + 1)
            alphabet[c.code] = r
        }
        return res
    }
}
