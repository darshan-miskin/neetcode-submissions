class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false

        val intArray = IntArray(26)

        s.forEachIndexed{ index, char ->
            intArray[s[index] - 'a']++
            intArray[t[index] - 'a']--
        }

        intArray.forEach{
            if(it != 0) return false
        }
        return true

        // val map = HashMap<Char, Int>()
        // s.forEach{
        //     map[it] = (map[it]?:0) + 1 
        // }

        // val map2 = HashMap<Char, Int>()
        // t.forEach{
        //     map2[it] = (map2[it]?:0) + 1
        // }

        // return map == map2
    }
}
