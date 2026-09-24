class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        if(nums.size <= 1) return nums.size
        var max = 1
        val hashSet = nums.toHashSet()

        hashSet.forEach{
            if(!hashSet.contains(it-1)){
                var count = 1
                for(i in 1 until hashSet.size){
                    if(hashSet.contains(it+i)){
                        count++
                        if(count>max) max = count
                    }
                    else break
                }
            }
        }

        return max
    }
}
