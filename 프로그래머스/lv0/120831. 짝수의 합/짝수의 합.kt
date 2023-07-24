class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        for(i in 0 until n+1){
            if(i%2==0 && n>=i){
                answer+=i
            }
        }
        return answer
    }
}