class Solution {
    fun maxArea(heights: IntArray): Int {
        var left = 0
        var right = heights.lastIndex

        var max = Integer.MIN_VALUE
        while(left < right){
            val area = min(heights[left], heights[right]) * (right-left)
            max = max(area, max)

            if(heights[left] < heights[right]) left++
            else right--
        }

        return max
    }
}
