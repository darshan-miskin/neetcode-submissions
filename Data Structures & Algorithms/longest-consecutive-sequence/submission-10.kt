class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        if(nums.size <= 1) return nums.size
        var count = 1
        var max = count
        val hashSet = HashSet<Int>()
        hashSet.addAll(nums.toList())

        hashSet.forEach{
            if(!hashSet.contains(it-1)){
                for(i in 1 until hashSet.size){
                    if(hashSet.contains(it+i)){
                        count++
                        if(count>max) max = count
                    }
                    else {
                        count = 1
                        break
                    }
                }
            }
        }

        return max
    }
}
