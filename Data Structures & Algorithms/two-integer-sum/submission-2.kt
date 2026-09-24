class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        val intArray = IntArray(2)
        nums.forEachIndexed{ i, num ->
            if(map.containsKey(num)){
                intArray[0] = map[num]?:0
                intArray[1] = i
            }
            map[target - num] = i
        }
        return intArray
    }
}
