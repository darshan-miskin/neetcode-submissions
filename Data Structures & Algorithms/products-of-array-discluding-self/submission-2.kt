class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val output = IntArray(nums.size)

        var product = 1
        nums.forEachIndexed{ i, num ->
            output[i] = product
            product *= num
        }

        product = 1
        for(i in nums.lastIndex downTo 0){
            output[i] *= product
            product *= nums[i]
        }

        return output
    }
}
