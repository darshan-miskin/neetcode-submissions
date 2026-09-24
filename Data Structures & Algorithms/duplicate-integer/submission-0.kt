class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val set = HashSet<Int>()
        nums.forEach{
            if(!set.add(it)) return true
        }
        return false
    }
}
