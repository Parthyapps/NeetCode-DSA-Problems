// Time complexity: O(nlog⁡n+mlog⁡m)O(nlogn+mlogm)
// Space complexity: O(1)O(1) or O(n+m)O(n+m) depending on the sorting algorithm.
// Where nn is the length of string ss and mm is the length of string tt. 
// use Sorting
class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length !=t.length){
            return false
        }
        return s.toCharArray().sorted()==  t.toCharArray().sorted()
    }
}
