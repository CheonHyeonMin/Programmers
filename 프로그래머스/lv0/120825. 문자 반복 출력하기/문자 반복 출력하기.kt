class Solution {
    fun solution(str: String, n: Int): String {
        var answer: String = ""
        
        for(i in str){
            for(j in 1..n){
                answer+=i
            }
        }
        
        
        
        return answer
    }
}