class Solution {
    fun solution(slice: Int, n: Int): Int {
        var answer: Int = 0
        if(n%slice == 0){
            return n/slice
        }
        else{
            return n/slice +1
        }
        
    }
}