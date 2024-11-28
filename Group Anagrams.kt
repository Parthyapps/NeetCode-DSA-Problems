class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val res = mutableMapOf<String, MutableList<String>>()
        for (s in strs){
            val sorteds = s.toCharArray().sorted().joinToString("")
            res.getOrPut(sorteds){mutableListOf()}.add(s)
        }
        return res.values.toList()
    }
}
