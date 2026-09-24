class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = HashMap<List<Int>, ArrayList<String>>()
        strs.forEach{ str ->
            val array = MutableList(26){0}
            str.forEach{ c ->
                array[c.toInt() - 97]++
            }
            if(map[array]==null) map[array] = ArrayList()
            map[array]?.add(str)
        }
        return map.values.toList()
    }
}
