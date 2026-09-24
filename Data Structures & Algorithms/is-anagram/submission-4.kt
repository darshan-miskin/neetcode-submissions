class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false

        val map = HashMap<Char, Int>()
        s.forEach{
            map[it] = (map[it]?:0) + 1 
        }

        val map2 = HashMap<Char, Int>()
        t.forEach{
            map2[it] = (map2[it]?:0) + 1
        }

        println("map: $map \t map2: $map2")

        return map == map2
    }
}
