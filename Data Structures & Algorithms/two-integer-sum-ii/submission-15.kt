class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()

        var index1 = 1
        var index2 = 1
        var index = 0

        while(index<numbers.size) { 
            val num = numbers[index]
            val r = target-num

            if(map.containsKey(num)){
                index1 = map.getValue(num)
                index2 = index
                break
            }
            else 
                map.put(r, index)
            
            index++
        }

        return intArrayOf(index1+1, index2+1)
    }
}
