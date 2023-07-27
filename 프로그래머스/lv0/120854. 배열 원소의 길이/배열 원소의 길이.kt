class Solution {
    fun solution(strlist: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        var a  = arrayListOf<Int>()
        for(i in strlist){
            a.add(i.length)
        }
        return a.toIntArray()
    }
}