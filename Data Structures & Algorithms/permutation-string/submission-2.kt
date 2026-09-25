class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        if(s1.length > s2.length) return false

        val s1Arr = IntArray(26)
        val s2Arr = IntArray(26)

        for(i in s1.indices){
            s1Arr[s1[i]-'a']+=1
            s2Arr[s2[i]-'a']+=1
        }

        var matchCount = 0
        for(i in 0 until 26){
            if(s1Arr[i] == s2Arr[i]) matchCount++
        }

        var l = 0
        for(r in s1.length until s2.length){
            if(matchCount==26) return true

            var index = s2[r]-'a'
            s2Arr[index]++
            if(s2Arr[index]==s1Arr[index])
                matchCount++
            else if(s2Arr[index] == s1Arr[index]+1)
                matchCount--

            index = s2[l]-'a'
            s2Arr[index]--
            if(s2Arr[index]==s1Arr[index])
                matchCount++
            else if(s2Arr[index] == s1Arr[index]-1)
                matchCount--

            l++
        }

        return matchCount == 26
    }
}
