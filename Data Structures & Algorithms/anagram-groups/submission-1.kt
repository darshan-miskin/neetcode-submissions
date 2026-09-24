class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = HashMap<String, ArrayList<String>>()
        strs.forEach{ str ->
            val array = Array<Char>(26){' '}
            var keyString = ""
            str.forEach{ c ->
                array[c.toInt() - 97]++
            }
            array.forEachIndexed{ i, c ->
                keyString+= i.toString()+c.toString().trim()
            }
            if(map[keyString]==null) map[keyString] = ArrayList()

            map[keyString]?.add(str)
        }

        val finalList = ArrayList<ArrayList<String>>()
        map.keys.forEach{ key ->
            finalList.add(map[key]!!)
        }
        return finalList
    }
}
