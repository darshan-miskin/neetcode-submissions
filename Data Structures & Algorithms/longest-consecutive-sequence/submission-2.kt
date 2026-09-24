class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        if(nums.size <= 1) return nums.size
        var count = 1
        var max = count
        val sorted = nums.toList().sorted()
        val sequence = sorted.toSet()

        sequence.forEach{
            if(sequence.contains(it-1)){
                count++
                if(count>max) max = count
            }
            else 
                count=1
        }

        return max
    }
}
