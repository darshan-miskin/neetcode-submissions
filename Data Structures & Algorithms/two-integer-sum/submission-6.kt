class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        nums.forEachIndexed{ i, num ->
            if(map.containsKey(num)){
                return intArrayOf(map[num]?:0, i)
            }
            map[target - num] = i
        }
        return intArrayOf(-1,-1)
    }
}
