class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        val alphabets = IntArray(26){0}

        var maxLen = 0
        var l = 0
        var r = 0
        var out = 0
        for(r in s.indices){
            fun index(pos: Int) = s[pos].code - 'A'.code
            alphabets[index(r)] += 1 
            maxLen = maxOf(maxLen, alphabets[index(r)])

            while(r - l +1 - maxLen > k){
                alphabets[index(l)] -= 1
                l++
            }

            out = maxOf(out, r - l +1)
        }

        return out
    }
}
