class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val map = HashMap<Int, Int>()
        nums.forEach{
            val count = map.getOrDefault(it,0)+1
            map[it] = count
        }

        val freq = MutableList(nums.size + 1) { arrayListOf<Int>() }
        map.keys.forEach{
            val f = map.getValue(it)
            freq[f].add(it)
        }

        val out = IntArray(k)

        var kc = 0
        for(i in freq.lastIndex downTo 0){
            if(freq[i].size == 0) continue
            
            freq[i].forEach{
                if(kc<k){
                    out[kc] = it
                    kc++
                }
                else
                    return out
            }
        }
        return out
    }
}
