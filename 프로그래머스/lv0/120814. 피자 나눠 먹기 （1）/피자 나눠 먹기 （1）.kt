class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var pizza = 7
        if(n%pizza==0){
            return n/pizza
        }
        else{
            return n/pizza +1
        }
        
        
        
    }
}