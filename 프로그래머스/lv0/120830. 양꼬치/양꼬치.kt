class Solution {
    fun solution(n: Int, k: Int): Int {
        var answer: Int = 0
        //12000원짜리 양꼬치 10인분 먹으면 음료 하나 꽁짜 음료는 하나에 2000원
        answer = (n*12000)+(k*2000)
        if(n>=10){
            
        }
        for(i in 0..n){
            if(i>=10 && i%10==0){
                answer-=2000
            }
            
        }
        return answer
    }
}