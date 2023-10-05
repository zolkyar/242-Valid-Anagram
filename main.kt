class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length == 0 || t.length == 0 || s.length != t.length) {return false}
        val newS = s.toList().sorted()
        val newT = t.toList().sorted()
        
        if (newS == newT) {
            return true
        }

        return false
    }
}