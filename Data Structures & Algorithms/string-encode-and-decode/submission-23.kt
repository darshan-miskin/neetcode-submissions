class Solution {

    fun encode(strs: List<String>): String {
        if(strs.isEmpty()) return "[]"
        val sb = StringBuilder()
        strs.forEachIndexed{ i, it ->
            if(i==0) sb.append("$it")
            else sb.append("~$it")
        }
        println("sb: $sb")
        return sb.toString()
    }

    fun decode(str: String): List<String> {
        return if(str == "[]") ArrayList<String>() else str.split("~")
    }
}
