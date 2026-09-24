class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val output = ArrayList<ArrayList<Int>>()
        Arrays.sort(nums)

        var i = 0
        var j = 1
        var k = 2
        while(i <= nums.lastIndex-2){
            j = i+1
            k = nums.lastIndex
            while(j < k){
                val sum = nums[i]+nums[j]+nums[k]
                if(sum == 0){
                    while(j < k && nums[j+1] == nums[j]){
                        j++
                    }
                    while(j < k && nums[k-1] == nums[k]){
                        k--
                    }
                    output.add(arrayListOf(nums[i], nums[j], nums[k]))
                    j++
                    k--
                }
                else if(sum > 0)
                    k--
                else 
                    j++
            }
            while(i < nums.lastIndex-2 && nums[i+1] == nums[i]){
                i++
            }
            i++
        }
        return output
    }
}
//[-4,-1,-1,0,1,2]
